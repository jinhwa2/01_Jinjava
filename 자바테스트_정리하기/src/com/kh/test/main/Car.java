package com.kh.test.main;

public class Car {
//�ʵ�
	private String �����̸�;
	private int �𵨳⵵;
	private String ����;

// �޼���
	// Setter
	public void set�����̸�(String �����̸�) {
		this.�����̸� = �����̸�;
	}

	public void set�𵨳⵵(int �𵨳⵵) {
		this.�𵨳⵵ = �𵨳⵵;
	}

	public void set����(String ����) {
		this.���� = ����;
	}

	// Getter
	public String get����() {
		return ����;
	}

	public String get�����̸�() {
		return �����̸�;
	}

	public int get�𵨳⵵() {
		return �𵨳⵵;
	}

//������	
	// ������ : �ʼ�
	public Car(String �����̸�, int �𵨳⵵, String ����) {
		this.�����̸� = �����̸�;
		this.�𵨳⵵ = �𵨳⵵;
		this.���� = ����;
	}

//������ : �⺻
	public Car() {
		this("K5", 2013, "������");
	}

//String
	public String ����() {
		return this.�𵨳⵵ + " ���" + this.�����̸� + " " + this.����;
	}

//main
	public static void main(String[] args) {
		Car newCar = new Car();
		System.out.println(newCar.����());
	}
}
