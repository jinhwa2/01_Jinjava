package com.kh.fileEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePre {
	public static void main(String[] args) throws IOException {
		String �����̸� = "practice.txt";
		File file = new File(�����̸�);

		if (file.exists()) {
			System.out.println("������ �̹� �����մϴ�");
		} else {
			file.createNewFile();
			System.out.println("������ �����߽��ϴ�.");

		}
	 //���� ���ۼ�
		FileWriter ���ۼ� = new FileWriter(file);
		���ۼ�.write("Java\n");
		���ۼ�.write("File\n ");
		���ۼ�.write("��ü\n ");
		
		���ۼ�.close();
	}
}