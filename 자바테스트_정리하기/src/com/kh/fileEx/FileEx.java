package com.kh.fileEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileEx {
	public static void main(String[] args) throws IOException {
		//������ �����ϴ��� Ȯ��
		//���ϸ���� �� �ۼ��ϱ�
		//������ java �ڵ带 �ۼ��ϰ� �ִ� ���� �ٷ� �Ʒ��� �������
		//����� �ڹ��׽�Ʈ_�����ϱ� ��� ���� �ؿ� ������� ����
		String �����̸� = "example.txt";
		
		File file = new File(�����̸�);
		//������ �����ϴ��� Ȯ��
		if(file.exists()	) {
			System.out.println("������ �̹� �����մϴ�.");
		} else {
			file.createNewFile();  //�������� throw���ְ� ����
			System.out.println("������ �����߽��ϴ�.");
		}
		//�� �ۼ��ϱ�
		FileWriter �۾��� = new FileWriter(file);
		�۾���.write("�̰��� �����ۼ� �����Դϴ�.\n");// \n ����ó��
		�۾���.write("�۾��� ����� �����ϰ� �ֽ��ϴ�.\n");
		
		//���� �� �ۼ��ߴٸ� �Ź� close �� ����ؼ� �ݾ��ֱ�
		//�츮�� � ������ �ۼ��ϸ鼭 �������� �ʰ� �����Ҷ�
		//�����Ͻðڽ��ϱ�? ��� ������ �߸鼭 ���� ��Ұ� ������ ��ó��
		//close �� ����Ѵٴ� ���� �����ϱ�� ���� �ǹ�
		//close�� �ۼ����� �ʴ´ٴ� ���� ���� �ۼ��ϴ� ����ϴ� �Ͱ� ���� �ǹ�
		
		�۾���.close();
		System.out.println("������ ������ �ۼ��߽��ϴ�.");
	}
}
