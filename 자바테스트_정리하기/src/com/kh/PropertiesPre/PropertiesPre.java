package com.kh.PropertiesPre;
//����Ű ctrl shift s �ۼ����ΰ� ��� �������� ����
import java.util.Map;
import java.util.Properties;

public class PropertiesPre {
	public static void main(String[] args) {
		Properties ���� = new Properties();
		
		//�Ӽ� ����
		����.setProperty("�̸�", "��ټ�");
		����.setProperty("����", "15"); //��� ǥ��� ���� ���� " " �ۼ��ؾ���
		����.setProperty("��°�", "����");
		
		//Ư�� �� ��ȸ�ϱ�
		String �̸���ȸ = ����.getProperty("�̸�");
		System.out.println("�̸� : "+�̸���ȸ);
		
		//��ü ��ȸ�ϱ�
		System.out.println("=== ��ü ��ȸ ===");
		//ProPerties ���� Map.Entry ����ؼ� ��ü ��ȸ�� �� �� ����
		//ProPerties ���ڿ��� �ۼ��� �ϱ� ������ Object  Object 
		for( Map.Entry<Object, Object> g    :    ����.entrySet()) {
			Object key = g.getKey();
			Object value = g.getValue();
			System.out.println(key+" : "+value);
			
		}
	}
}
