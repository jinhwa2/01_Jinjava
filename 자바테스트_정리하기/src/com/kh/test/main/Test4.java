package com.kh.test.main;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		/*
		
		 
		  ���ϱ� ���� ���ϱ� �� ����ϱ�
		  
		  int ����1
		  int ����2
		  
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("1~9���� ���ڸ� �Է¹޽��ϴ�.");
		System.out.print("����1 �� �Է����ּ���: ");
		int ����1 = sc.nextInt();
		//���࿡ ����1�� 1~9���� ���� �ƴ϶��
		//shift�� ������ ���ϴ� �� �Ʒ� ���� ȭ��ǥ ���ϴ� ��ŭ �Է� ctrl altȭ��ǥ
		System.out.print("����2 �� �Է����ּ���:");
		int ����2 = sc.nextInt();
		// 1���� 9���� ���� ��ĳ�ʷ� ���� �Է¹޾�
		
		if(����1 <1 || ����1>9) {
			System.out.println("1���� 9 ������ ������ �Ԥ����ϼ���.");
			return; //���α׷� ����
		}
		//��
		if(����2 <1 || ����2>9) {
			System.out.println("1���� 9 ������ ������ �Ԥ����ϼ���.");
			return; //���α׷� ����
		}
		//��
		int �� = ����1+����2;
		//����
		int ���� = ����1-����2;
		//���ϱ�
		int �� = ����1*����2;
		//��
		int �� = ����1/����2;
		
		
		System.out.println(����1+" + "+����2+" = "+��);
		System.out.println(����1+" - "+����2+" = "+����);
		System.out.println(����1+" * "+����2+" = "+��);
		System.out.println(����1+" / "+����2+" = "+��);
		
		
		
		
		
			
		}
	
		
		
		
		
	}

