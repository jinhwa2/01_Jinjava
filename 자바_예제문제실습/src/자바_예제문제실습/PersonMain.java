package �ڹ�_���������ǽ�;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PersonMain {
	public static void main(String[] args) {
		PersonMain ����������ϸ���� = new PersonMain();
		����������ϸ����.fileSave("�迵����������.txt");
		
		
	}
	public void fileSave(String �����̸�/*���� ������ ���� �̸�*/) {
		//File FileWriter bufferedWriter ����ؼ� ���� �ۼ��ϰ� ����
		
		File file = new File(�����̸�/*���� ������ �����̸�*/);
		
		try {
			FileWriter fw = new FileWriter(�����̸�);
			BufferedWriter bw = new BufferedWriter(fw);
			
			Person ��� = new Person("�迵��",10);
			bw.write(���.toString());
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		}
}
