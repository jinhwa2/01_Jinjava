package �ڹ�_���������ǽ�;
/*
ĸ��ȭ
String ����̸� �迵��
int ���� 10
������ ��� �����
toString

 PersonMain person.txt
 * */
public class Person {
 //�ʵ�
	private String ����̸�;
	private int ����;
	
//�޼��� Getter Setter	
	public void set����̸�(String ����̸�) {
		this.����̸� = ����̸�;
	}
	public void set����(int ����) {
		this.���� = ����;
	}
	public String get����̸�() {
		return ����̸�;
	}
	public int get����() {
		return ����;
	}
	
	//�⺻������
	public Person() {
	// TODO Auto-generated constructor stub
}	
	//�ʼ�������
	public Person(String ����̸�, int ����) {
		this.����̸� = ����̸�;
		this.���� = ����;
	}
	
	@Override
	public String toString() {
		return "����̸�=" + ����̸� + ", ����=" + ����;
	}
	
	public void fileSave() {
		
	}
}
