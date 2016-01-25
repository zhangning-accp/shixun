package com.shixun.c21.c3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by zn on 2016/1/25.
 *  服务器端
 */
public class Server {
    public void start() {
        ServerSocket serverSocket;
        Socket socket = null;
        BufferedWriter writer = null;
        BufferedReader reader = null;
        try {
            System.out.println("在端口10000启动服务器......");
            //1. 开启端口的监听
            serverSocket = new ServerSocket(10000);
            //2.创建Socket对象,当程序运行到此会被阻塞，等待客户端连接，一旦客户端连接进来
            //该方法会生成一个和当前连接进来的客户端一一对应的一个Socket对象。
            socket = serverSocket.accept();
            //获取客户端的ip和端口号等你信息
            System.out.println("接受到客户端的连接.......");
            //3. 输出消息到客户端
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));//new BufferedWriter(new OutputStreamWriter(out));
            writer.write("客户端，你好!..\r\n");
            writer.flush();
            //创建输入流，接收客户端发送的消息
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg = "a";
            Scanner scanner = new Scanner(System.in);
            while(msg != null || msg.trim().equals("")) {
                msg = reader.readLine();//接收消息
                System.out.println("客户端说：" + msg);
                if(msg.trim().equals("exit")) {
                    break;
                }
                //向客户端发送消息
                System.out.println("请输入您要发送给客户端的内容：");
                msg = scanner.next();
                writer.write(msg + "\r\n");
                writer.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
             try {
                 if(writer != null) {
                     writer.close();
                 }

             } catch(IOException e) {
                e.printStackTrace();
             }
        }
    }

    public static void main(String [] args) {
            new Server().start();
    }

}
