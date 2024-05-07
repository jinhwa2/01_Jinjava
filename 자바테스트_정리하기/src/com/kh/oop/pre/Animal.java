package com.kh.oop.pre;
//상속 부모
public class Animal {
//필드
	private String name;
//메서드
	//Getter Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
	//메서드
	//생성자 필수 alt shift s o enter
	public Animal(String name) {
		super();
		this.name = name;
	}
	
	//void
	public void makesound() {
		System.out.println(name+ " 가 소리를 냅니다.");
	}


}
