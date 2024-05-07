package ncs.test13;

import java.util.*;

public class MapTest {
	public static void main(String[] args) {
		Map<String ,Inventory> inventoryMap	= new HashMap<>();
		
		//��ǰ ���� String ���� � �ڵ������� �ۼ� Inventory �ڵ��� ���� �ֱ�
		//��ǰ ���� ���
		Calendar Ķ���� = Calendar .getInstance();
		//Ķ������ �޷��̱� ������ �޷��� ���� 1ȸ ����
		
		Ķ����.set(2016,Ķ����.MARCH,15);
		inventoryMap.put("�Ｚ ������S7", new Inventory("�Ｚ ������S7",Ķ����.getTime(),30));
		
		Ķ����.set(2016,Ķ����.FEBRUARY,25);
		inventoryMap.put("LG G5", new Inventory("LG G5",Ķ����.getTime(),30));
		
		Ķ����.set(2016,Ķ����.JANUARY,23);
		inventoryMap.put("���� �����е� ����", new Inventory("���� �����е� ����",Ķ����.getTime(),30));
		
		
		
		
		
		try {
		
		
		Ķ����.set(2016,Ķ����.APRIL,28);
		inventoryMap.get("�Ｚ ������S7").setGetDate(Ķ����.getTime()); //��� ��¥
		inventoryMap.get("�Ｚ ������S7").setGetAmount(10); //��� ����
		
		inventoryMap.get("LG G5").setGetDate(Ķ����.getTime());
		inventoryMap.get("LG G5").setGetAmount(10);
		
		inventoryMap.get("���� �����е� ����").setGetDate(Ķ����.getTime());
		inventoryMap.get("���� �����е� ����").setGetAmount(10);
		
		//���࿡ ��ǰ�� �������� ���� ��� AmountNotEnough �ְ� ����� �� ��
		for(Inventory �κ��丮 : inventoryMap.values()) {
			//���� ������ �ִ� �纸��  < ��� ���� �� ���� ���
			
			//  �Ǹ��ϰ����ϴ¾�      > ���簡���� �ִ¾�
			if(�κ��丮.getGetAmount()> �κ��丮.getPutAmount()) {
				throw new AmountNotEnough("�������� ��� ������ �ʰ��߽��ϴ�.");
			}
		}
		  
		} catch(AmountNotEnough e) {
			
		}
		
		
		//for-each���� Ȱ���ؼ� ��ǰ ���� ���
		for(Inventory  e : inventoryMap.values()) {
			System.out.println(e.toString());//��ǰ���� ���
		}
		//����� �ȸ� ��ǰ�� ���� ������ ����� ��� ���� ���� ������ ����
	}
}
