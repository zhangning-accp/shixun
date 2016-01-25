package com.shixun.c21.c5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.LinkedList;

/**
 * Created by zn on 2016/1/25.
 * 业务处理线程
 */
public class BizThread extends Thread {
    private Socket socket;
    LinkedList<Socket> sockets = new LinkedList();
    SocketAddress address = null;
    public BizThread(Socket socket,LinkedList sockets) {
        this.socket = socket;
        this.sockets = sockets;
        //获取客户端的ip和端口号等你信息
        address = socket.getRemoteSocketAddress();
        System.out.println("接受到客户端的连接......." + address);
    }

    /**
     * 广播信息
     * @param msg
     */
    public void broadcast(String msg) {
        BufferedWriter writer = null;
        for(Socket s : sockets) {
            if(s != socket) {
                try {
                    writer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                    writer.write(msg + "\r\n");
                    writer.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void run() {
        BufferedWriter writer = null;
        BufferedReader reader = null;
        try {
            //3. 输出消息到客户端
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));//new BufferedWriter(new OutputStreamWriter(out));
            writer.write("客户端，" + address + "你好!..\r\n");
            writer.flush();
            //创建输入流，接收客户端发送的消息
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg = "";
            while (msg != null || !msg.trim().equals("")) {
                msg = reader.readLine();//接收消息
                System.out.println("客户端" + address + "说：" + msg);
                if (msg.trim().equals("exit")) {
                    broadcast("客户端退出...客户端信息为：" + address);
                    sockets.remove(socket);//将客户端移除
                    break;
                }
                broadcast(msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
                if(socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
