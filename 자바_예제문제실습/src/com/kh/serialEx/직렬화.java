package com.kh.serialEx;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//����ȭ
public class ����ȭ implements Serializable {
	// ����ȭ�� �����͸� ������ ���� ���
	public static void main(String[] args) {
		
	String �����̸� = "student.txt";

	// ����ȭ�ؼ� ������ ��ü ����
	Student �л� = new Student("�ڸ���",30);

	// ��ü�� ���Ϸ� ����ȭ�ϴ� �ڵ�
	try
	{
	FileOutputStream fos = new FileOutputStream(�����̸�);
	
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	 //��ü�� ����ȭ�ؼ� ���� �ۼ��ϱ�
	oos.writeObject(�л�);
	oos.close();
	System.out.println("��ü�� ����ȭ�ؼ� ���Ͽ� �����߽��ϴ�.");

}catch(
	Exception e)
	{
		e.printStackTrace();
	}

}
	}
