package com.kh.pizzaOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class PizzaShop {
	public static void main(String[] args) {
		//�ֹ� ����� ������ ArrayList �ֹ�����Ʈ
		//���� ���� ����Ʈ�� �ѹ��� ���� ArrayList ����
		ArrayList<PizzaOrder> �ֹ�����Ʈ = new ArrayList<>();
		ArrayList<String> ������Ʈ = new ArrayList<>(Arrays.asList("����", "��ö��","�ȿ���","����","��ö��"));
		ArrayList<String> ���ڸ���Ʈ = new ArrayList<>(Arrays.asList("����δ�", "�����Ը���","������","���ξ���","ġ��"));
	
		//for���� Ȱ���ؼ� �ֹ� �߰�
		for(int i =0; i <������Ʈ.size(); i++) {
			PizzaOrder ���� = new PizzaOrder(������Ʈ.get(i),���ڸ���Ʈ.get(i));
			�ֹ�����Ʈ.add(����);
		}
		System.out.println(������Ʈ);
		System.out.println(���ڸ���Ʈ);
		System.out.println(�ֹ�����Ʈ);
	
	//HashSet ����ؼ� �ߺ� �ֹ��� �����ϱ� ���� set  �ߺ��ֹ�����
		HashSet<String> �ߺ��ֹ� = new HashSet<>();
		
		
	//�ֹ��߰� PizzaOrder�� ����ؼ� �ֹ��� �߰���
		
	//�ֹ��� ���� ��ü���� toString
		
	//�ߺ��� �ֹ� ���� �����Ѱ� ���
	}

}
