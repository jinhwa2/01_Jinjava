package com.kh.goodShop;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ��ǻ�Ͱ��� {
	public static void main(String[] args) {
		Map<String,Integer> �����ǰ = new HashMap<>();
		//�����ǰ HashMap
		
		//��Ʈ�� 700000
		�����ǰ.put("��Ʈ��", 700000);
		�����ǰ.put("����ũž", 20000);
		�����ǰ.put("�����", 5000);
		�����ǰ.put("���콺", 3000);
		�����ǰ.put("Ű����", 2000);
		//����ũž 20000
		//����� 5000
		//���콺 3000
		//Ű���� 2000
		System.out.println("��ǻ�� ��ǰ ���");
		//Entry ����ؼ� ���
		for(Map.Entry<String, Integer> e :�����ǰ.entrySet()) {
			String ��ǰ�� = e.getKey();
			int ��ǰ���� = e.getValue();
			System.out.println(��ǰ�� + " �� "+��ǰ����+ " ��");
			
		}
		
		//Ư�� ��ǰ�� ���� ���
		//Scanner�� �Է¹޾Ƽ� Ȯ��
		Scanner sc = new Scanner(System.in);
		System.out.println("ã�� ������:");
		String ã�¹��� = sc.nextLine(); //"usb
		
		System.out.println(ã�¹���+ " ���Կ� �ֽ��ϱ�?");
		//containsKey �����ϴ��� �������� �ʴ��� if�� ����ؼ� Ȯ����
		//�����Ѵٸ� ��~! �����մϴ�.
		//���������ʴ´ٸ� ǰ���Դϴ�.
		if(�����ǰ.containsKey(ã�¹���)) {
			int ��ǰ�� = �����ǰ.get(ã�¹���);
			System.out.println("�� �����մϴ�.������"+��ǰ��+"�Դϴ�.");
		} else {
			System.out.println("ǰ���Դϴ�.");
		}
		
		
		
	}
}
