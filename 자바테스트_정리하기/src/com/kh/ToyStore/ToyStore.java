package com.kh.ToyStore;

import java.util.*;

public class ToyStore {
	public static void main(String[] args) {
		//�峭�� ���� ��� HashMap ���� ǥ��
		//������� ����x Ű�� �ߺ�x
		Map<String,Integer> ��� = new HashMap<>();
		���.put("�ڵ���", 10);
		���.put("����", 15);
		���.put("��", 20);
		
		//�峭�� ��� ��� �����ִ���
		System.out.println(���);
		for(Map.Entry<String, Integer> e : ���.entrySet()) {
			System.out.println("��Ʈ�� :"+e);
			System.out.println(" Ű�� Ȯ��: "+e.getKey());
			System.out.println(" ���� Ȯ��: "+e.getValue());
		}
	}
}
