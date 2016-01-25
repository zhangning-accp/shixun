package com.shixun.c21.c4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by zn on 2016/1/25.
 * 业务处理线程
 */
public class BizThread extends Thread {
    private Socket socket;
    public BizThread(Socket socket) {
        this.socket = socket;
    }
    public void run() {
        BufferedWriter writer = null;
        BufferedReader reader = null;
        try {
            //3. 输出消息到客户端
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));//new BufferedWriter(new OutputStreamWriter(out));
            writer.write("客户端，你好!..\r\n");
            writer.flush();
            //创建输入流，接收客户端发送的消息
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg = "a";
            Scanner scanner = new Scanner(System.in);
            while (msg != null || msg.trim().equals("")) {
                msg = reader.readLine();//接收消息
                System.out.println("客户端说：" + msg);
                if (msg.trim().equals("exit")) {
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
                if (writer != null) {
                    writer.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
