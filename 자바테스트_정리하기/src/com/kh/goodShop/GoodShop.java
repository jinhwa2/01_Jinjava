package com.kh.goodShop;

import java.util.HashMap;
import java.util.Map;

public class GoodShop {
	public static void main(String[] args) {
		Map<String, Integer> 아이템 = new HashMap<>();

		System.out.println("어서오세요. 제주에 오신 것을 환영합니다.^^");

		// 물품과 가격추가
		아이템.put("동백모자", 20000);
		아이템.put("감귤모자", 15000);
		아이템.put("흑돼지키링", 25000);

		// 물픔 목록 보기 Map.Entry
		// Map<String,Integer> = Map.Entry<안에 들어있는 타입이 Map과 동일해야함>
		// 아이템을 하나씩 키-값으로 꺼내보기 : 안에 들어있는 아이템 모두 보기
		for (Map.Entry<String, Integer> e : 아이템.entrySet()) {
			String 제품 = e.getKey(); // 제품만 가져옴
			int 가격 = e.getValue(); // 제품 가격만 가져옴
			System.out.println(제품 + " 은 " + 가격 + " 입니다.");
		}
		// 특정 물품의 가격보기
		System.out.println("저기요~! 이거 얼마인가요~!");
		String 제품명 = "오미자볼펜";
		// 오미자 볼펜이 있는지 확인하고 얼마인지 애기함
		// 내가가진 아이템에서 손님이 찾는 제품명이 판매하기 위해 존재하는지 확인하기
		if (아이템.containsKey(제품명)) { // 아이템이 판매로 존재한다면
			int 제품가격 = 아이템.get(제품명); // 오미자볼펜을 검색했을때 존재하면 정보 가져오기
			System.out.println(제품명 + " 의 가격은 " + 제품가격 + "원");
		} else { // 판매중이 아니거나 전시용만 존재할 경우
			System.out.println(제품명 + " 은(는) 전시용으로 판매하는 상품이 아닙니다.");
		}
	}
}
