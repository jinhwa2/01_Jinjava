package sup1.controller;

import java.util.Scanner;

import sup1.model.Student;

public class TestSup2 {
 //Scanner 를 이용해서 이름 학년 반 번호 성별 성적
	public static void main(String[] args) {
		Scanner 스캐너 = new Scanner(System.in);
		System.out.print("학생의 이름은: ");
		String 이름 = 스캐너.nextLine();
		System.out.print("학생의 학년은: ");
		int 학년 = 스캐너.nextInt();
		System.out.print("학생의 반은: ");
		int 반 = 스캐너.nextInt();
		System.out.print("학생의 번호는: ");
		int 번호 = 스캐너.nextInt();
		System.out.print("학생의 성별은: ");
		char 성별 = 스캐너.next().charAt(0);
		System.out.print("학생의 성적은: ");
		double 성적 = 스캐너.nextDouble();
		
		Student 학생 = new Student(이름,학년,반,번호,성별,성적);
		학생.정보();
		
	}
}
