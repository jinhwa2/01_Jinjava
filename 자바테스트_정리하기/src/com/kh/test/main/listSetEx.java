package com.kh.test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

//ArrayList�� HashSet �Բ� ����ϱ�
public class listSetEx {
   public static void main(String[] args) {
	ArrayList<String> ����Ʈ = new ArrayList<>();
	
	//���߰�
    ����Ʈ.add("����");
    ����Ʈ.add("�ܹ���");
    ����Ʈ.add("�������");
    ����Ʈ.add("����");
    
    //HashSet ���� �ʱ�ȭ
    //��ü�� ���� �ν��Ͻ� ����
    HashSet<String> �ؽü� = new HashSet<>();
    
    �ؽü�.add("����");
    �ؽü�.add("�ܹ���");
    �ؽü�.add("�������");
    �ؽü�.add("����");
    
    System.out.println(����Ʈ);
    System.out.println(�ؽü�);
    
    // Ű�� ���ڵ� o �ߺ� x
    HashMap<Integer,String> �ؽø� = new HashMap<>();
    System.out.println("�ȳ��ϼ���. ���ϰ��Կ� ���� ���� ȯ���մϴ�.");
    �ؽø�.put(1, "����");
    �ؽø�.put(2, "�м��ĸ���");
    �ؽø�.put(3, "����ƾ");
    
    System.out.println(�ؽø�);
    �ؽø�.put(1,"���θӽ���");
    System.out.println(�ؽø�);
    		
}
}
