package com.kh.test.main;

public class Test2 {
	public static void main(String[] args) {
		/* 2단에서 5단까지의 구구단의 결과 중 홀수인 것만 출력한다. 단, for문을 이용한다. */
		for (int 단 = 2; 단 <= 5; 단++) {
			System.out.println("===" + 단 + "단 ======");
			for (int 장 = 1; 장 <= 9; 장 += 2) {
				System.out.println(단 + "*" + 장 + " = " + (단 * 장));
			}
			System.out.println(단 + "종료!!!");
		}
	}
}
