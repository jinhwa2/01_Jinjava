package com.kh.test.main;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		/*
		Ű����� 1���� ������
		�����͸� �Է� �޾� 1���� 5���� �϶��� �ش� ���ڿ� �ش��ϴ� ����� ����Ѵ�.\
		��, switch���� �̿��Ѵ�.
		
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("1���� ������ �Է��ϼ���: ");
		int num1 = sc.nextInt();
		switch(num1) {
		case 1:
			System.out.println("�Է��� ���������� �Ǿ����ϴ�!");
			break;
		case 2 :
			System.out.println("��ȸ�� ���۵Ǿ����ϴ�!");
			break;
		case 3:
			System.out.println("������ ���������� �Ǿ����ϴ�!");
			break;
		case 4:
			System.out.println("������ ���������� �Ǿ����ϴ�!");
			break;
		case 5:
			System.out.println("���������� ����Ǿ����ϴ�.");
			break;
		default:
			System.out.println("�ٽ� �Է����ּ���.");
				
		}
		sc.close();
		
		
	}
}
