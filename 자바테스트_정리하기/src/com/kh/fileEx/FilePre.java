package com.kh.fileEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePre {
	public static void main(String[] args) throws IOException {
		String 파일이름 = "practice.txt";
		File file = new File(파일이름);

		if (file.exists()) {
			System.out.println("파일이 이미 존재합니당");
		} else {
			file.createNewFile();
			System.out.println("파일을 생성했습니다.");

		}
	 //파일 글작성
		FileWriter 글작성 = new FileWriter(file);
		글작성.write("Java\n");
		글작성.write("File\n ");
		글작성.write("객체\n ");
		
		글작성.close();
	}
}