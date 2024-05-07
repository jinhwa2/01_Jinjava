package com.kh.serialEx;

import java.io.Serializable;

//�л��� ����ȭ�ϱ�
public class Student implements Serializable  {
//�ʵ�	
	private String name;
	private int age;
//�޼���
	//Getter Setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	//�ʼ� ������
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//�⺻ ������
	public Student() {
		
	}
	//toString
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age;
	}
 
}
