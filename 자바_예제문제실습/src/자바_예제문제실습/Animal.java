package �ڹ�_���������ǽ�;

import java.io.Serializable;

/*
ĸ��ȭ ��Ģ�� �°� �����ϱ�
//�ٸ����� ����Ҽ� ������ ����ȭȭ�ϱ� 
*/
public class Animal implements Serializable {
//�ʵ�
    private String �����̸�;
    private int ����;
	
//�޼���
    //Getter 
    //Setter
    public void set�����̸�(String �����̸�) {
		this.�����̸� = �����̸�;
	}
	public void set����(int ����) {
		this.���� = ����;
	}
	public String get�����̸�() {
		return �����̸�;
	}
	public int get����() {
		return ����;
	}
    
    //�⺻������ ��Ʈ�� �����̽� ����
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	//�ʼ�������  Alt shift s o
	public Animal(String �����̸�, int ����) {
		super();
		this.�����̸� = �����̸�;
		this.���� = ����;
	}
	
	
	//@Overrde toString Ȱ���ؼ� ���ڿ� ����ϱ� Alt shift s s
	@Override
	public String toString() {
		return "�����̸�=" + �����̸� + ", ����=" + ����;
	}
	
	
	
	
	
}
