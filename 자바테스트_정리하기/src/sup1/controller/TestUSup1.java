package sup1.controller;

import java.util.Scanner;

import sup1.model.Score;

public class TestUSup1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� :");
		int korean = sc.nextInt();
		System.out.println("�������� :");
		int english = sc.nextInt();
		System.out.println("�������� :");
		int math = sc.nextInt();
		
		//��ĳ�� �̿��ؼ�
		//�������� �������� �������� �Է¹ް�
		
		Score ���� = new Score(korean,english,math);
		����.���();
	
	}
}
