package sup1.model;

public class Score {
//�ʵ�
	private int korean;
	private int english;
	private int math;
	
	
	
//�޼���
	//�ʼ� ������
	public Score(int korean,int english,int math) {
		this.korean = korean;
		this.english = english; 
		this.math = math;
		
	}
	
	//void
	public void ���() {
		
		String ��� = (korean>=50 && english>=50 && math>=50 ) ? "�հ�" : "���հ�";
		
			System.out.println("�������� : "+korean);
			System.out.println("�������� : "+english);
			System.out.println("�������� : "+math);
			
		}
		
		//��� 50�� �̻��̸� �հ�
		//���׿����ڷ� �հ� ���հ�
		// �� ������ 50 �̻� ��� 50�� �̻�
		//��¹����� ����� ����������
		//���׿����ڿ� ���� �ᰡ ���
	
}

