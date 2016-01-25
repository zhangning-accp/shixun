package com.shixun.c21.c5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by zn on 2016/1/25.
 * 客户端代码
 */
public class Client {
    public void start() {
        Socket socket = null;
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            //1. 连接服务器，靠Socket对象
            socket = new Socket("127.0.0.1",10000);
            //2. 接收服务器发送的消息.接收数据就是读消息，所以要使用输入流，
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //通过流读取服务器消息，这里读的是整行数据，是否读取整行数据取决于服务器发送的方式。
            //也可以使用while循环方式来读取。和之前学的流操作没有区别。唯一不同的就是我们的源来自网络。
            String msg = reader.readLine();
            System.out.println("服务器对我说：" + msg);
            //开始发送消息给服务器,创建输出流
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            Scanner scanner = new Scanner(System.in);
            msg = "";
            while(true) {//如果发送的消息不是exit结束，则一直循环执行
                System.out.println("请输入您要发送的消息：");
                msg = scanner.next();//获取用户在控制台输入的消息，
                writer.write(msg + "\r\n");//发送消息到服务器，
                writer.flush();
                if(msg.trim().equals("exit")) {
                    break;
                }
                //接收服务器的消息
                msg = reader.readLine();
                System.out.println("服务器对我说：" + msg);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {//socket关闭，流对象也会关闭。同时如果流对象关闭，socket也会被关闭
                if(reader != null) {
                    reader.close();
                }
                if(writer != null) {
                    writer.close();
                }
                if(socket != null) {
                    socket.close();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String [] args) {
        Client client = new Client();
        client.start();
    }
}

