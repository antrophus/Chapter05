package com.javaex.ex04.스트림.배열.스플릿.짬뽕기.콤보;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PersonApp {

	public static void main(String[] args) throws IOException {

		// 리스트 생성
		List<Person> personList = new ArrayList<Person>();

		// 읽기 스트림
		InputStream in = new FileInputStream("C:\\javaStudy\\MS949.txt"); // 파일을 읽어온다.
		InputStreamReader isr = new InputStreamReader(in, "MS949"); // 읽어온 파일을 해석한다.
		BufferedReader br = new BufferedReader(isr); // 해석한 파일을 읽는다.

		while (true) {
			// 한줄씩 읽어서 str에 담는다.
			String str = br.readLine();
			// 데이터가 없으면 끝.
			if (str == null) {
				break;

			}
			// 데이터가 있으면,
			// 데이터를 # 기준으로 쪼개라 split()
			String[] personInfo = str.split("#"); // split 으로 한줄의 데이터를 #을 기준으로 쪼갠다.

			// person으로 묶는다.
			Person person = new Person(personInfo[0], personInfo[1], personInfo[2]);

			// 리스트에 담는다.
			personList.add(person);
		}

		for (int i = 0; i < personList.size(); i++) {
			System.out.println(personList.get(i).toString());

		}

		br.close();

	}

}
