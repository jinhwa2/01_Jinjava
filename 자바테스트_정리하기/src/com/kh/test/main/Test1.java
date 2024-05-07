package com.kh.test.main;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * 키보드 1개의 정수형(int) 데이터를 입력받아, 1~100 사이의 값일 때만 2의 배수인지 아닌지를 출력 처리한다.
		 */
		Scanner 스캐너 = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num1 = 스캐너.nextInt();
		// 만약에 숫자가 1~100사이일 때 연산자
		if (num1 >= 1 && num1 <= 100) {
			// 2의 배수인지 아닌지 if else로 확인
			if (num1 % 2 == 0) {
				System.out.println("2의 배수입니다.");
			} else {
				System.out.println("2의 배수가 아닙니다.");
			}
		} else {
			System.out.println("1부터 100 사이 값만 입력해주세요");
		}
		System.out.println("======if else if else");
		int 숫자 = 5;
		if (숫자 > 0) {
			System.out.println("양수입니다.");
		} else if (숫자 < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}

	}

}
