package com.kh.test.main;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ����ǥ���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ѱ��� �Է��ϼ���: ");
		String �Է� = sc.nextLine();

		// ������ �ݺ��ϴ� ������ ��-�R �ѱ��̶��
		if (Pattern.matches("^[��-�R]*$", �Է�)) {
			System.out.println("�Է��� ���ڿ��� �ѱ��Դϴ�.");
		} else {
			System.out.println("�ѱ۸� �Է����ּ���.");
		}

	//��ȭ��ȣ 0-9 �Է��ϴ� ��ĳ�� �����غ���
		
		System.out.print("��ȭ��ȣ�� - ������ ���� �Է��غ�����");
		String ��ȭ��ȣ = sc.nextLine();
		
		if(Pattern.matches("^[��-�R]*$", ��ȭ��ȣ)) {
			System.out.println("�Է��� ���ڿ��� ��ȭ��ȣ �����Դϴ�.");
			//Integer.parseInt(��ȭ��ȣ); ->���ڷ� ����
		} else {
			System.out.println("��ȭ��ȣ ������ �ƴմϴ�.");
		}
		
		
		
		
		
		
		
	}

}
