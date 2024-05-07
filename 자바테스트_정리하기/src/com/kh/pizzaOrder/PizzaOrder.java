package com.kh.pizzaOrder;

public class PizzaOrder {
//필드 = 전역변수
	//각각의 맴버변수
	private String 고객명;
	private String 피자타입;

	//세터, 게터 셀렉겍테, 셀렉세터
public void set고객명(String 고객명) {
		this.고객명 = 고객명;
	}

	public void set피자타입(String 피자타입) {
		this.피자타입 = 피자타입;
	}

public String get고객명() {
		return 고객명;
	}

	public String get피자타입() {
		return 피자타입;
	}

	
	//생성자 필수
	public PizzaOrder(String 고객명, String 피자타입) {
		this.고객명 = 고객명;
		this.피자타입 = 피자타입;
	}

	//@Override toStrign return 고객이름 피자타입
	@Override
	public String toString() {
		return "PizzaOrder [고객명=" + 고객명 + ", 피자타입=" + 피자타입 + "]";
	}

	
	

	
}
