package sup1.controller;

import java.util.Scanner;

import sup1.model.Student;

public class TestSup2 {
 //Scanner �� �̿��ؼ� �̸� �г� �� ��ȣ ���� ����
	public static void main(String[] args) {
		Scanner ��ĳ�� = new Scanner(System.in);
		System.out.print("�л��� �̸���: ");
		String �̸� = ��ĳ��.nextLine();
		System.out.print("�л��� �г���: ");
		int �г� = ��ĳ��.nextInt();
		System.out.print("�л��� ����: ");
		int �� = ��ĳ��.nextInt();
		System.out.print("�л��� ��ȣ��: ");
		int ��ȣ = ��ĳ��.nextInt();
		System.out.print("�л��� ������: ");
		char ���� = ��ĳ��.next().charAt(0);
		System.out.print("�л��� ������: ");
		double ���� = ��ĳ��.nextDouble();
		
		Student �л� = new Student(�̸�,�г�,��,��ȣ,����,����);
		�л�.����();
		
	}
}
