package sup1.model;

public class Student {
	String �̸�;
	int �г�;
	int ��;
	int ��ȣ;
	char ����;
	double ����;
//�޼���
	//�ʼ� ������ �̸� �г� �� ��ȣ ���� ���� ��Ʈ ����Ʈ ���� ��
	public Student(String �̸�, int �г�, int ��, int ��ȣ, char ����, double ����) {
		this.�̸� = �̸�;
		this.�г� = �г�;
		this.�� = ��;
		this.��ȣ = ��ȣ;
		this.���� = ����;
		this.���� = ����;
	}
	
	//publid void ����() {      //���̸� ���л� �� ���л�
	public void ����() {
		//String ����Ȯ�� = (���� == 'M') ? 
		String ����Ȯ�� = (���� == 'M') ?  "���л�" : "���л�";
		System.out.println(�г� + "�г� " + ��+ "�� "+��ȣ+"��ȣ "+"����Ȯ�� "+����Ȯ��
				           +"  "+�̸�+" �� ������ "+����+ "�̴�.");
		
	}
}
