package com.kh.test.main;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPre {

	public static void main(String[] args) {
		//set ���� ��� �������̽� �̱� ������ 
		//Set �� = new Set<>(); X �Ұ�!!
		//Set �� = new HashSet<>(); ����!!
		
		Set<String> ��1 = new HashSet<>();
		��1.add("���");
		��1.add("�ٳ���");
		��1.add("������");
		System.out.println("�ؽü� :"+��1);
		
		Set<Integer> ��2 = new TreeSet<>();
		
		��2.add(5);
		��2.add(2);
		��2.add(8);
		System.out.println("Ʈ���� :"+��2);
		
		Set<String> ��3 = new LinkedHashSet<>();
		
		��3.add("��ȭ");
		��3.add("���");
		��3.add("Ƽ��");
		
		System.out.println("��ũ���ؽü�:"+��3);
		
		//clear remove isEmpty
		
		//set get ����ؼ� ���� �����ϰų� ������ �� ����, �ߺ��Ұ�
		
		

	}

}
