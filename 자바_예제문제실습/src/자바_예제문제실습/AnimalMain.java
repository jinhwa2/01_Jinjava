package �ڹ�_���������ǽ�;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AnimalMain {
	//fileSave
	//���޹��� ������ ���Ͽ� �����ϰ� �����ϴ� �ڵ� �ۼ�
	public void fileSave(String �����̸�/*���߿� ���� ���� �̸�*/) {
		
		File file = new File(�����̸�/*���߿� ���޹��� ���� �̸�*/);
		
		//������ �����ϰ� ���� �ۼ��ϴ� write ����
		try {
			FileWriter fw = new FileWriter(file);
			
			//���Ͽ� ���ڿ��� �ۼ��� �� ������ ��±��� �����ִ� BufferedWriter ���
			BufferedWriter bw = new BufferedWriter (fw);
			
			//Animal ��ü ���� ���ۼ��ؼ� ����
			Animal ���� = new Animal("�����",3);
			//toString���� ��µǴ� ������ ����
			bw.write(����.toString());
			
			bw.close();
			System.out.println("������ ���������� ����Ǿ����ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		//Animal ���� = new Animal("�ڳ���",2);
		//System.out.println(����);  //to ��Ʈ���� �̿��ؼ� ��µ�
		AnimalMain �����������ϸ���� = new AnimalMain();
		�����������ϸ����.fileSave("animal.txt");
	}
}
