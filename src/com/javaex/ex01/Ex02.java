package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {
	
	public static void main(String[] args) throws IOException{
		
		InputStream in = new FileInputStream("c:\\javaStudy\\img.jpg");
		OutputStream out = new FileOutputStream("c:\\javaStudy\\byteBuffImg.jpg");
		
		byte[] buff = new byte[1024];
		
		System.out.println("복사시작");
		while(true) {
			
			int data = in.read(buff);
			System.out.println(data);
			
			if(data == -1) {
				System.out.println("복사끝");
				break;
			}
			
			out.write(buff);
		}
		
		
		in.close();
		out.close();
		System.out.println("프로그램 끝");
		
	}

}
