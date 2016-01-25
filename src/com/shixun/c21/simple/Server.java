package com.shixun.c21.simple;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by zn on 2016/1/25.
 *  服务器端
 */
public class Server {
    public void start() {

        ServerSocket serverSocket;
        Socket socket = null;
        OutputStream out = null;
        //BufferedWriter writer = null;
        PrintWriter writer = null;
        try {
            System.out.println("在端口10000启动服务器......");
            //1. 开启端口的监听
            serverSocket = new ServerSocket(10000);
            //2.创建Socket对象,当程序运行到此会被阻塞，等待客户端连接，一旦客户端连接进来
            //该方法会生成一个和当前连接进来的客户端一一对应的一个Socket对象。
            socket = serverSocket.accept();
            System.out.println("接受到客户端的连接.......");
            //3. 输出消息到客户端
            out = socket.getOutputStream();
            writer = new PrintWriter(out);//new BufferedWriter(new OutputStreamWriter(out));
            writer.write("客户端，你好!..\r\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
             try {
                 if(writer != null) {
                     writer.close();
                 }
                 if(out != null) {
                     out.close();
                 }
             } catch(IOException e) {
                e.printStackTrace();
             }
        }
    }

    public static void main(String [] args) {
            new  Server().start();
    }

}
