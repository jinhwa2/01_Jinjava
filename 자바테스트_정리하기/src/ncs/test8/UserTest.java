package ncs.test8;

public class UserTest {
	public static void main(String[] args) {
		//User ��ü�� ������ �ִ� �迭 ����
		User[] users = new User[3];
		
		//3���� User ��ü �����ؼ� �迭�� �ֱ�
		users[0] = new User("user01","���1","��ö��",32,'M',"010-1234-5678");
		users[1] = new User("user02","���2","�̿���",25,'F',"010-5555-7777");
		users[2] = new User("user03","���3","Ȳ����",20,'F',"010-9874-5632");
	
		//User�� ��� �迭�� ��� ���
		for(User user :users) {
			System.out.println(user.toString());
		}
	
		//���� ���� ���� ������ �״�� �����ؼ� ���簡 �� �Ǿ����� ���
		User[] �������� = new User[users.length];
		//������ ó������ ������ ��� ����
		for(int i =0;i < users.length; i++) {
			��������[i] = users[i].clone();//��������
			System.out.println(��������[i].toString());
		}
	
	}
}
