package com.kh.oop.pre;
//��� �θ�
public class Animal {
//�ʵ�
	private String name;
//�޼���
	//Getter Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
	//�޼���
	//������ �ʼ� alt shift s o enter
	public Animal(String name) {
		super();
		this.name = name;
	}
	
	//void
	public void makesound() {
		System.out.println(name+ " �� �Ҹ��� ���ϴ�.");
	}


}
