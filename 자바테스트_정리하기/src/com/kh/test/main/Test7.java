package com.kh.test.main;

public class Test7 {
	public static void main(String[] args) {
			//�迭�� ����ִ� ������ �� Ȧ���� ������ ����ϰ� ���� ���Ѵ�.
			//��, continue �� �̿��Ͽ� �ۼ��Ѵ�
		int[] �迭 = {1,2,3,4,5,6,7,8,9,10};
		double �� = 0;
		//for - each ���� ����ؼ� ��� ����
			//if ���� ����ؼ�( % 2!=0
		  			//�ƴϸ� += ���ֱ�
		for(int ����: �迭) {
			/*
			���� % 2 == 0 ¦�����ϱ�
			���� % 2 != 0 Ȧ�����ϱ� 
			 * */
			if(����%2 !=0) {
				System.out.println(����);
			} else {
				��+=����;
			}
		}
		System.out.println("�հ� :"+��);
		
		//�հ� ����ϱ�
		
		
		
		
	}
}
