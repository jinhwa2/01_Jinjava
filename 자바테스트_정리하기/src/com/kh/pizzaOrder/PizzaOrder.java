package com.kh.pizzaOrder;

public class PizzaOrder {
//�ʵ� = ��������
	//������ �ɹ�����
	private String ����;
	private String ����Ÿ��;

	//����, ���� ��������, ��������
public void set����(String ����) {
		this.���� = ����;
	}

	public void set����Ÿ��(String ����Ÿ��) {
		this.����Ÿ�� = ����Ÿ��;
	}

public String get����() {
		return ����;
	}

	public String get����Ÿ��() {
		return ����Ÿ��;
	}

	
	//������ �ʼ�
	public PizzaOrder(String ����, String ����Ÿ��) {
		this.���� = ����;
		this.����Ÿ�� = ����Ÿ��;
	}

	//@Override toStrign return ���̸� ����Ÿ��
	@Override
	public String toString() {
		return "PizzaOrder [����=" + ���� + ", ����Ÿ��=" + ����Ÿ�� + "]";
	}

	
	

	
}
