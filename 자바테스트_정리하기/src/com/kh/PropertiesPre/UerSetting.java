package com.kh.PropertiesPre;

import java.util.Map;
import java.util.Properties;

public class UerSetting {
 public static void main(String[] args) {
	//Properties 객체와 인스턴스 생성 = setting
	 Properties setting = new Properties() ;
	 
	 //속성 설정
	 setting.setProperty("name", "john");
	 setting.setProperty("age", "17");
	 setting.setProperty("city", "seoul");
	
	 //city 조회하기/특정값 조회하기
	 String info = setting.getProperty("city");
	 System.out.println("city"+info);
	 
	 //조회내용 출력
	 //전체조회하기 Map.Entry<Object,Object> key value 출력
	 System.out.println("전체조회하기");
	 for(Map.Entry<Object, Object> e : setting.entrySet()) {
		 Object key = e.getKey();
		 Object value = e.getValue();
		 System.out.println(key+" : "+value);
	 }
}
}
