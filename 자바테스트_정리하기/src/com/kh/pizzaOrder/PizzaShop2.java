package com.kh.pizzaOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PizzaShop2 {
	public static void main(String[] args) {
	//�ֹ������ ������ ArrayList
		List<PizzaOrder> �ֹ�����Ʈ = new  ArrayList<>();
		
		//PizzaOrder �ֹ�1 = new PizzaOrder("����,"����δ�");"
		//�ֹ�����Ʈ.add(�ֹ�1);
		/*
		 ������ �ۼ��� �ֹ�����Ʈ��
		 �ؿ��� �ۼ��� �ֹ�����Ʈ��
		 �ֹ��� �ۼ��� ����� �ٸ� ������
		 �����ϰ� �ֹ��� �߰��ϴ� ���
		  �ֹ�����Ʈ.add(new PizzaOrder("����","����δ�"));
		 * */
	//PizzaOrder �ʼ� ������ �̿��ؼ� �ٷ� �Է�
		�ֹ�����Ʈ.add(new PizzaOrder("����","����δ�"));
		�ֹ�����Ʈ.add(new PizzaOrder("��ö��","�����Ը���"));
		�ֹ�����Ʈ.add(new PizzaOrder("�ȿ���","������"));
		�ֹ�����Ʈ.add(new PizzaOrder("����","���ξ���"));
		�ֹ�����Ʈ.add(new PizzaOrder("��ö��","ġ��"));
		
		
	//HashSet ����ؼ� �ߺ� �ֹ��� �����ϱ� ���� set  �ߺ��ֹ�����
		//HashSet<String> �ߺ��ֹ� = new HashSet<>();
		
		
	//�ֹ��� ���� ��ü���� toString
	//toString �߰��� � ����� �����Ѵ� ���� �ʾƵ� PizzaOrder �� �ۼ��� ��ü��
	//������ ��Ȯ�ϰ� ����Ѵٴ� �ǹ̷� ǥ���
		System.out.println(�ֹ�����Ʈ);
		
	//1���� ���� �ʹٸ� �� ��ġ
		for(PizzaOrder �ֹ� : �ֹ�����Ʈ) {
			System.out.println(�ֹ�);
		}
		
	//�ߺ��� �ֹ� ���� �����Ѱ� ���
	}

}
