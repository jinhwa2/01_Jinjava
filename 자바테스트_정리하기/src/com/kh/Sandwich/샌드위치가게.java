package com.kh.Sandwich;

import java.util.*;

public class ������ġ���� {
	public static void main(String[] args) {
		List<������ġ> �ֹ�����Ʈ = new ArrayList<>();
		//�ֹ��߰�
		�ֹ�����Ʈ.add(new ������ġ("���ϳ�","BLT"));
		�ֹ�����Ʈ.add(new ������ġ("�̵�","��Ű"));
		�ֹ�����Ʈ.add(new ������ġ("���ϳ�","ġŲ"));
		�ֹ�����Ʈ.add(new ������ġ("�̼�","���׸���"));
		�ֹ�����Ʈ.add(new ������ġ("���ϳ�","�����ͺ�"));
		System.out.println(�ֹ�����Ʈ);
		
		//���� HashSet
		Set<String> ���� = new HashSet<>();
		
		//�ߺ����� ArrayList
		ArrayList<������ġ> �ߺ����������ֹ� = new ArrayList<>();
		
		for(������ġ �ֹ� : �ֹ�����Ʈ) {
			if(!����.contains(�ֹ�.get����())) {
				�ߺ����������ֹ�.add(�ֹ�);
				����.add(�ֹ�.get����());
			}
		//�ߺ����Ÿ���Ʈ ���
		System.out.println(�ߺ����������ֹ�);
		//for-each
		}
		for(������ġ  �ֹ� : �ߺ����������ֹ�) {
			System.out.println(�ֹ�);
		
		}
		
	}
}

