package com.kh.test.main;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
	   // while�� �̿��ؼ� 1���� 100������ ��� �������� �հ� ��� ���ϱ�
		int ���ۼ��� = 1;
		int ������ = 0;
		int ī��Ʈ = 0; //�ݺ��� Ƚ�� ��� �ݺ��ߴ��� Ȯ��
		
		
		
		//while
		while(���ۼ���<=100) {
			������ += ���ۼ���; //1+2+3.....+100
			ī��Ʈ++ ;
			���ۼ��� ++  ;
		}
		
		//��ձ��ϱ�
		double ��� =(double) ������/ī��Ʈ;
		// �����հ� ��� ����ϱ�
		System.out.println("�հ� : "+������);
		System.out.println("���: "+���);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// while���� ����ؼ� switch �� ��� ���� �ۼ��ϰ� ������ְ�
		// case 3: ���� ������ֱ� return;

		// switch case �� �����غ���
		Scanner ��ĳ�� = new Scanner(System.in);
		String ���� ;
		//String ���� = ""; "System.out.println("���� :" + ����);" ���� ������ ������ ��ó���
		//whil�� true ��ſ� true�� ����� �ִ� ������ �ϳ� ����� �ְ�
		//��������true -<false �� ������� �� �����ũ��
		boolean ��� = true;
		while (���) {
			System.out.print("���� �ۼ�:");
			int ��¥ = ��ĳ��.nextInt();
			switch (��¥) {
			case 1:
				���� = "������ : ����";
				break;
			case 2:
				���� = "ȭ���� : ����";
				break;
			case 3:
				System.out.println("�����մϴ�.");
				//return;
				��� = false;
				break;
			default:
				���� = "��¥�� ������� �޽�";
			}
			//System.out.println("���� :" + ����);
		}
	}
}