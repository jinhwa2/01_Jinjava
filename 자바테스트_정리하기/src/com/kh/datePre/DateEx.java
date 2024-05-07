package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		//Date�� ����1ȸ�� ȣ��
		Date now = new Date();
		
		// ��-��-�� ����ϱ�
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		String formatSdf1= sdf1.format(now);
		System.out.println(formatSdf1);
		
		//���ڿ�(SimpleDateFormat - String) �� ��¥(Date) ����
		String ��¥���ڿ� = "2024-05-03";
		try {
			Date parseDate1 = sdf1.parse(��¥���ڿ�);
			System.out.println(parseDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//��:��:��
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
		String formatSdf2 = sdf2.format(now);
		System.out.println(formatSdf2);
		//���ڿ�(SimpleDateFormat - String) 	�� ��¥(Date) ���� 
		try {
			Date parseDate2 = sdf2.parse(formatSdf2);
			System.out.println(parseDate2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//��-��-�� ��:��:�� ����ϱ�
		SimpleDateFormat Sdf3 = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss");
		String formatSdf3 = Sdf3.format(now);
		System.out.println(formatSdf3);
		//���ڿ�(SimpleDateFormat - String) 	�� ��¥(Date) ���� 
		try {
			Date parseDate3 = Sdf3.parse(formatSdf3);
			System.out.println(parseDate3);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
