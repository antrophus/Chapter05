package Homework;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class InputSt {

	public static void main(String[] args) throws IOException {
		// 읽기 스트림
		InputStream in = new FileInputStream("C:\\javaStudy\\MS949.txt");
		InputStreamReader isr = new InputStreamReader(in, "MS949");
		BufferedReader br = new BufferedReader(isr);
		

		while (true) {
			
			String str = br.readLine();
			if (str == null) {
				break;
			}
		
			String[] sArray = str.split("#");
			String name = sArray[0];
			String hp = sArray[1];
			String company = sArray[2];
			
//			System.out.println("------------------");
//			System.out.println(name);
//			System.out.println(hp);
//			System.out.println(company);
//			System.out.println("------------------");
			
			Person p01 = new Person(name, hp, company);
			
			
			List<Person> pList = new ArrayList<Person>();
			
			pList.add(p01);
			
			
		
			

		}

		br.close();

	}

}
