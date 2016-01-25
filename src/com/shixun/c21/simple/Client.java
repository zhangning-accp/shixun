package com.shixun.c21.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by zn on 2016/1/25.
 * 客户端代码
 */
public class Client {
    public void start() {
        Socket socket = null;
        InputStream in = null;
        BufferedReader reader = null;
        try {
            //1. 连接服务器，靠Socket对象
            socket = new Socket("127.0.0.1",10000);
            //2. 接收服务器发送的消息.接收数据就是读消息，所以要使用输入流，
            in = socket.getInputStream();
            reader = new BufferedReader(new InputStreamReader(in));
            //通过流读取服务器消息，这里读的是整行数据，是否读取整行数据取决于服务器发送的方式。
            //也可以使用while循环方式来读取。和之前学的流操作没有区别。唯一不同的就是我们的源来自网络。
            String msg = reader.readLine();
            System.out.println("服务器对我说：" + msg);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {//socket关闭，流对象也会关闭。同时如果流对象关闭，socket也会被关闭
                if(reader != null) {
                    reader.close();
                }
                if(in != null) {
                    in.close();
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

