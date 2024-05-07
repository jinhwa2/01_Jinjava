package com.kh.oop.pre;

//extends Animal 가져오기
public class Cat extends Animal {
//super 이용해서 Cat에서 부모클래스에 있는 필수 생성자 호출
	public Cat(String name) {
		super(name);
	}
	//메서드 오버라이딩 "고양이가: +getName() + "야용"
	@Override
	public void makesound()	{
		System.out.println("고양이가: "+getName()+"야용");
	}
}
