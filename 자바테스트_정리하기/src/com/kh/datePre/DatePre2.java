package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre2 {
   public static void main(String[] args) {
	Date now = new Date();
	//��¥ ���� 0000�� 00�� 00��
	//�� �� �� ���� -�̿� / _ ���ڸ� �ְ� �Ǹ� �ڵ����� �� �� �ʴ� ���� �о���� ����
	//��¥�� ���ڿ��� format����
	//���
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/EEEE");
	String formatesdf = sdf.format(now);
	System.out.println(formatesdf);
	
	
	//���ڿ��� ��¥�� parse�� ����ؼ� ����
	try {
		Date parseDate = sdf.parse(formatesdf);
		System.out.println(parseDate);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
   
   
   }
}
