package com.kh.oop.pre;
//�������̽��� ó���� ������ ���� �������� ����°� �翬
// �տ��� �ۼ��� �̿ϼ��� �޼��带 �ϼ��ش޶�� �������� �ߴ� ���̱� ����!

public class Circle implements Shape, Drawble    {

	@Override
	public double area() {
		return 4.8;
	}
	@Override
	public void draw() {
		System.out.println("���� ���ڰ� �׸��ϴ�.");
	}

}
