package com.kh.test.main.oop;

//e�����ϳ��� ��� implements Animal ���� �̿ܿ� ���� ������, ����ؼ� �ۼ��Ҽ� ����
//������ ����� interface �̾�߸���
//�������� �Ҹ��� ����� makeSound �� ����ǰ� ���� �ʱ� ������
//������������ �������� ����
public class Dog implements Animal, AnimalEat {
	//Animal�� �ִ� �������̽� �޼��� ����
	@Override //�ּ����� �ǹ̷� ������ �ص� �������� ������ ���� ������� �ۼ��ϴ� ���̱� ������
			//������ �������ؼ� �ۼ����ִ� ���� ����
	public void makeSound() {
		System.out.println("�۸�!");
	}
	
	@Override 
	public void eat() {
		System.out.println("�ȳ�");
	}


}
