package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {
	
	// 파일 읽기와 쓰기 -> 동시 진행하면 복사하기
	public static void main(String[] args) throws IOException {
		
		//읽기 기능 활성. 섞어쓰기를 통해서 호환성을 높임
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		//쓰기 기능 활성. 섞어쓰기를 통해서 호환성을 높임
		OutputStream out = new FileOutputStream("C:\\javaStudy\\byteimg.jpg");
		
		//반복적으로 파일 안의 데이터를 읽고, 쓴다. 
		while (true) {
			//읽어올 데이터 = in.메소드read()가 int형으로 불러오므로 자료형을 int로 쓴다.
			int data = in.read();
			System.out.println(data);
			
			//읽어올 데이터가 -1이 되면 읽기를 멈추고 동작을 끝낸다.
			if (data == -1) {
				//System.out.println("다 읽었음");
				break;
			}
			//while문에서 읽어온 데이터를 쓰기기능 활성창에 넣은 경로에 쓴다.
			out.write(data);

		}
		System.out.println("복사 끝");
		out.close();
		in.close();

	}

}
