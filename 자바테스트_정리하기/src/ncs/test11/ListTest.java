package ncs.test11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListTest {
	
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Random random = new Random();
		// 1���� 100 ���̿� ������ ���� 10���� �����ؼ� ����Ʈ�� �߰�
		for(int i =0 ; i<10; i++	) {
			list.add(random.nextInt(100)+1);
			
		}
		System.out.print("������ :");
		display(list);//List �ؿ� ����ϰ� �ൿ�ϰ� ����ϰ� ���� �޼��尡 �־ �ƴ��� ��������
		
		//�������� ����
		Collections.sort(list, new Decending());
		System.out.print("���� ��:");
		display(list);
		
		
	}
	//����Ʈ ��� �޼���
	public static void display(List<Integer> list) {
		for(int num : list) {
			System.out.print(num+ " ");
		}
		System.out.println(); //����ó�� �ٹٲ� ó��
	}
}
