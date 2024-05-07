package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre {
	public static void main(String[] args) {
		//현재 날짜와 시간
		Date now = new Date();
		//Fri May 03 10:33:04 KST 2024
		System.out.println(now);
		// Fri May 03 10:29:31 KST 2024 형식을
		// 우리가 원하는 형식으로 변경 SimpleDateFormat 사용해서 변경
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//now로 받은 날짜를 문자열로 SimpleDateFormat
		String formatsdf = sdf.format(now);
		System.out.println("날짜형식 변경: "+formatsdf);
		//문자열(SimpleDateFormat - String) -> 날짜(Date) 변경
		try {
			Date parseDate1 = sdf.parse(formatsdf);//"HH:mm:ss" 도 가능
			System.out.println(parseDate1);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy / MM / dd");
		String formatesdf2 = sdf2.format(now);
		System.out.println(formatesdf2);
		try {
			Date pareDate3 = sdf2.parse(formatesdf2);
			System.out.println("pareDate3");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
				
		String 문자열 = "2024-04-30 15:30:45";
		
		try {
			Date parseDate = sdf.parse(문자열);
			System.out.println(parseDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Date로 변경할 때 문제가 생길 수 있으니 try-catch 사용
		
	
	}
}
