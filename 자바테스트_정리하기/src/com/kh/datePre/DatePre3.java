package com.kh.datePre;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre3 {
  public static void main(String[] args) {
	Date now = new Date();
	
	SimpleDateFormat sdf = new SimpleDateFormat("yy / MM / dd / E");
	
	//System.out.println(sdf); java.text.SimpleDateFormat@3d658514
	
	//sdf �� ��ȯ�ϰ� ���� ��Ģ�� ������ ��¥�� ������ �� �ִ� ���� �ƴ�
	String formatsdf = sdf.format(now);
	System.out.println(formatsdf);
	
	System.out.println("�ֹι�ȣ�� 8�ڸ� �Է����ּ���.");
	SimpleDateFormat sdf2= new SimpleDateFormat("yyyyMMdd");
	String formatsdf2 = sdf2.format(now);
		System.out.println(formatsdf2 );
	
	//yyyy MM dd  0000�� 00�� 00��
		//yyyyMMdd  0000��00��00��
		//yy MM dd 
	
	
	
	
	System.out.println("�ֹι�ȣ�� 6�ڸ� �Է����ּ���.");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyMMdd");
	String formatsdf3 = sdf3.format(now);
	System.out.println(formatsdf3);
}
}
