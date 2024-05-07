package com.kh.Hamburger;

public class HamburgerOrder {
//필드
	private String 고객명;
	private String 버거타입;

//메서드
	// 세터
	public void setCustomer(String customer) {
		this.고객명 = 고객명;
	}

	public void setBurgerType(String burgerType) {
		this.버거타입 = 버거타입;
	}

	// 게터
	public String getCustomer() {
		return 고객명;
	}

	public String getBurgerType() {
		return 버거타입;
	}

//메서드
	// 필수생성자
	public HamburgerOrder(String 고객명, String 버거타입) {
		this.고객명 = 고객명;
		this.버거타입 = 버거타입;
	}

	// Override toString alt shift s s
	@Override
	public String toString() {
		return "고객명=" + 고객명 + ", 버거타입=" + 버거타입 + "]";
	}

}
