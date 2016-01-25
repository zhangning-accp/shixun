package com.shixun.c21.c5;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.LinkedList;

/**
 * Created by zn on 2016/1/25.
 *  服务器端
 */
public class Server {
    LinkedList<Socket> sockets = new LinkedList();
    public void start() {
        ServerSocket serverSocket;
        Socket socket = null;
        try {
            System.out.println("在端口10000启动服务器......");
            //1. 开启端口的监听
            serverSocket = new ServerSocket(10000);
            //2.创建Socket对象,当程序运行到此会被阻塞，等待客户端连接，一旦客户端连接进来
            //该方法会生成一个和当前连接进来的客户端一一对应的一个Socket对象。
            while (true) {
                socket = serverSocket.accept();
                sockets.add(socket);
                BizThread biz = new BizThread(socket,sockets);
                biz.start();
            }
            }catch(IOException e){
                e.printStackTrace();
            }
    }

    public static void main(String [] args) {
            new Server().start();
    }

}
