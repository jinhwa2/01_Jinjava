package com.kh.Sandwich;

import java.util.*;

public class 샌드위치가게 {
	public static void main(String[] args) {
		List<샌드위치> 주문리스트 = new ArrayList<>();
		//주문추가
		주문리스트.add(new 샌드위치("김하나","BLT"));
		주문리스트.add(new 샌드위치("이둘","터키"));
		주문리스트.add(new 샌드위치("김하나","치킨"));
		주문리스트.add(new 샌드위치("이셋","에그마요"));
		주문리스트.add(new 샌드위치("김하나","배지터블"));
		System.out.println(주문리스트);
		
		//고객명 HashSet
		Set<String> 고객명 = new HashSet<>();
		
		//중복제거 ArrayList
		ArrayList<샌드위치> 중복되지않은주문 = new ArrayList<>();
		
		for(샌드위치 주문 : 주문리스트) {
			if(!고객명.contains(주문.get고객명())) {
				중복되지않은주문.add(주문);
				고객명.add(주문.get고객명());
			}
		//중복제거리스트 출력
		System.out.println(중복되지않은주문);
		//for-each
		}
		for(샌드위치  주문 : 중복되지않은주문) {
			System.out.println(주문);
		
		}
		
	}
}

