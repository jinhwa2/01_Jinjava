package com.kh.test.main;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * Ű���� 1���� ������(int) �����͸� �Է¹޾�, 1~100 ������ ���� ���� 2�� ������� �ƴ����� ��� ó���Ѵ�.
		 */
		Scanner ��ĳ�� = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int num1 = ��ĳ��.nextInt();
		// ���࿡ ���ڰ� 1~100������ �� ������
		if (num1 >= 1 && num1 <= 100) {
			// 2�� ������� �ƴ��� if else�� Ȯ��
			if (num1 % 2 == 0) {
				System.out.println("2�� ����Դϴ�.");
			} else {
				System.out.println("2�� ����� �ƴմϴ�.");
			}
		} else {
			System.out.println("1���� 100 ���� ���� �Է����ּ���");
		}
		System.out.println("======if else if else");
		int ���� = 5;
		if (���� > 0) {
			System.out.println("����Դϴ�.");
		} else if (���� < 0) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("0�Դϴ�.");
		}

	}

}
