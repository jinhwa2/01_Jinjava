package com.kh.test.main;

public class Test2 {
	public static void main(String[] args) {
		/* 2�ܿ��� 5�ܱ����� �������� ��� �� Ȧ���� �͸� ����Ѵ�. ��, for���� �̿��Ѵ�. */
		for (int �� = 2; �� <= 5; ��++) {
			System.out.println("===" + �� + "�� ======");
			for (int �� = 1; �� <= 9; �� += 2) {
				System.out.println(�� + "*" + �� + " = " + (�� * ��));
			}
			System.out.println(�� + "����!!!");
		}
	}
}
