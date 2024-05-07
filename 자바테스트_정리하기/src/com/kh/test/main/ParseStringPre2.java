package com.kh.test.main;

public class ParseStringPre2 {
	public static void main(String[] args) {
		//1. String���� ���� �ڵ�����ȣ�� ������ ����
		String phoneNumber = "01012345678";
		int num1 = Integer.parseInt(phoneNumber);
		System.out.println(num1);
		
		
		//2. String���� ���� ������ �Ǽ��� ����
		String score = "88.5";
		double num2 = Double.parseDouble(score);
		System.out.println(num2);
		
		//3. ������ ���� �ڵ�����ȣ�� String���� ��ȯ
		int phoneNumber2 = 102345678;
		String str1 =  Integer.toString(phoneNumber2);
		System.out.println(str1);
		
		//4. �Ǽ��� ���� ������ String���� ����
		double score2 = 72.5;
		String str2 = Double.toString(score2);
		System.out.println(str2);
		
		//���ڿ�����     -      ����������
		String phoneNumber3 = "010-1234-5678";
		//replace � ���� ��� ���� ��� �ٲٱ�
		//""�ȿ� �ƹ��͵� �ۼ������� ������ ������� �ǹ̷� ���
		String ���������� = phoneNumber3.replace("-", "");
		System.out.println("�����¿��� ���ŵ� �ڵ��� ��ȣ :"+����������);
		
		//�ֹι�ȣ���� ������ ����
		String id = "230304-1234567";
		String �ֹι�ȣ = id.replace("-","");
		System.out.println("�����¿��� ���ŵ� �ֹι�ȣ : "+�ֹι�ȣ);
		
		//charAt(7)
		//�ֹε�� ��ȣ���� �������� �����ϰ� ������ �����ϱ�
		//            0  1  2  3  4  5   6  7
//		String id2 = "2  4  0  1  0  1-  3  4  5  6789";
		String id2 = "240101-3456789";
		String �ֹι�ȣ2 = id2.replace("-", "");
		char ������ȣ = �ֹι�ȣ2.charAt(6); //�������� ���ŵǾ 7�� �ƴ϶� 6
		System.out.println("���� ��ȣ�� : "+������ȣ);
		
		//3�׿����ڸ� ����ؼ� ������ȣ�� 1�Ǵ� 3�̸� ? "����" : "����";
		String  ���� = (������ȣ == '1' ||  ������ȣ =='3'           ) ?    "����" : "����";
		System.out.println(����);
	
		
		//�ֹι�ȣ���� - �����ϰ� ���׿����ڸ� ����ؼ� ���� ����
		String id3 = "200101-4567891";
		String �ֹι�ȣ3 = id3.replace("-", "");
		char ������ȣ3 = �ֹι�ȣ3.charAt(6);
		//   '   '  char ǥ��
		String ����3 = (������ȣ3 == '2'  ||  ������ȣ3 == '4') ?  "����"  : "����";
		System.out.println(����3);
		
		String �ֹι�ȣ4 = "870101-2345678"; //index: 0~13  ���� :14
		//�ֹι�ȣ�� �տ��� 6�ڸ��� �´��� Ȯ���ϰ� �ڿ��� 7�ڸ��� �´��� Ȯ��
		
		boolean is�ֹ� = 
				// [0-9]�� ���� ��
				(�ֹι�ȣ4.length() == 14) && //1.�ֹε�Ϲ�ȣ�� - �����ؼ� 14�ڸ��� �´��� Ȯ��
				(�ֹι�ȣ4.charAt(6) == '-')&&//2.�ֹε�Ϲ�ȣ ������� �ۼ��� -���ִ�����
				// 0~5
				(�ֹι�ȣ4.substring(0,6).matches("[0-9]+")) &&//3.�տ� 6�ڸ��� ���ڷθ� �̷���� �ִ���
				(�ֹι�ȣ4.substring(7).matches("[0-9]+"));//4.�ڿ���7������ ��� ���ڷ� �̷���� �ִ���
		
		System.out.println("�ֹι�ȣ�� ����� �ۼ��� �̷��������? "+is�ֹ�);
	
	
	
	}

}
