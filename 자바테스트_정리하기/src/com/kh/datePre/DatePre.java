package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre {
	public static void main(String[] args) {
		//���� ��¥�� �ð�
		Date now = new Date();
		//Fri May 03 10:33:04 KST 2024
		System.out.println(now);
		// Fri May 03 10:29:31 KST 2024 ������
		// �츮�� ���ϴ� �������� ���� SimpleDateFormat ����ؼ� ����
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//now�� ���� ��¥�� ���ڿ��� SimpleDateFormat
		String formatsdf = sdf.format(now);
		System.out.println("��¥���� ����: "+formatsdf);
		//���ڿ�(SimpleDateFormat - String) -> ��¥(Date) ����
		try {
			Date parseDate1 = sdf.parse(formatsdf);//"HH:mm:ss" �� ����
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
		
		
				
		String ���ڿ� = "2024-04-30 15:30:45";
		
		try {
			Date parseDate = sdf.parse(���ڿ�);
			System.out.println(parseDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Date�� ������ �� ������ ���� �� ������ try-catch ���
		
	
	}
}
