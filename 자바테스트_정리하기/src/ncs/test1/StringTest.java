package ncs.test1;

public class StringTest {
	public static void main(String[] args) {
		/*
		 �־��� String �����͸� ��,���� ������ 5���� �Ǽ� �����͵��� ������ �հ� ����� ���Ѵ�. 
         ��, String ���ڿ��� ��� �Ǽ� �����͸� �迭�� ����� ���
		  */
		String str = "1.22,4.12,5.93,8.71,9.34";

		//���ڿ��� , �������� ������ �迭�� ���� ��ٱ���ó��  �����
		//split , �� �������� �����ٴ� ��
		String[] numbers = str.split(",");
		
		// , ���� �Ǽ����� ��Ƽ� double ��  �����
		double[] values = new double[numbers.length];
		//number ���� ���� �ִ� ���̸�ŭ ��ٱ��� �迭 ũ�⸦ ����
		
		//���ڿ��� ����� �迭�� �Ǽ��� ��ȯ�ϴ� ����ȯ
		for(int i = 0; i <numbers.length; i++) {
			// ���ڿ�(String)�� �Ǽ�(double)�� ��ȯ�ϴµ� ���
			values[i] = Double.parseDouble(numbers[i]);
			System.out.println("values[" + i +  "] = " +values[i]);
		}
		 //�Ǽ��� ������� ������ �� ���ϱ�
		double �� = 0;
		for(double num : values) {
			�� += num;
		}
		
		//��� ���ϱ�
		double ��� = ��  / values.length;
		
		//���
		System.out.println("���� �־��� ��: "+ str);
		System.out.println("��        ��: "+��);
		System.out.println("��        ��: "+���);
		
	
	}

}
