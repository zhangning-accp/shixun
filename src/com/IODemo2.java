package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class IODemo2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String msg = "";
		StringBuffer buffer = new StringBuffer("");
		
		while (!msg.trim().equals("exit")) {
			System.out.println("请输入内容，如果是exit则程序退出");
			msg = input.next();
			buffer.append(msg);
		}
		
		try {
			FileOutputStream out = new FileOutputStream("D:/IOStudy1.txt");
			//FileWriter out = new FileWriter("D:/IOStudy1.txt");
//			OutputStreamWriter out = new OutputStreamWriter(
//					new FileOutputStream("D:/IOStudy1.txt"), "UTF-8");
			//BufferedWriter out1 = new BufferedWriter(out);
			out.write(buffer.toString().getBytes());

			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileReader in = new FileReader("D:/IOStudy1.txt");
			//InputStreamReader in = new InputStreamReader(new FileInputStream("D:/IOStudy1.txt"), "UTF-8");
			//BufferedReader in1 = new BufferedReader(in);
			buffer = new StringBuffer();
			char[] c = new char[1];
			while (in.read(c) != -1) {
				msg = new String(c);
				buffer.append(msg);
			}
			in.close();
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		System.out.println(System.getProperty("file.encoding"));
		System.out.println("文件读取如下：" + buffer.toString());

	}

}
