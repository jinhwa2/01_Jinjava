package com.kh.oop.pre;

//extends Animal ��������
public class Cat extends Animal {
//super �̿��ؼ� Cat���� �θ�Ŭ������ �ִ� �ʼ� ������ ȣ��
	public Cat(String name) {
		super(name);
	}
	//�޼��� �������̵� "����̰�: +getName() + "�߿�"
	@Override
	public void makesound()	{
		System.out.println("����̰�: "+getName()+"�߿�");
	}
}
