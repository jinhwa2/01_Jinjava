package �ڹ�_���������ǽ�;

import java.io.FileWriter;
import java.io.IOException;
/*
 ������ �ִ� animal.txt ���Ͽ� �ڻԼ�~�ڳ���ģ���ڻԼҸ� �̾ �ۼ��Ϸ��ϴµ�
 �̾ �ۼ��� �ȵ�
 �����̸�=�����, ����=3
 
  �ؿ� �ڻԼ�, 10 �ڳ���ģ�� �ڻԼҰ� �̾ ����ǰ� ������ֱ�
 * */
public class FileMain {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("animal.txt",true);
			fw.write("\n�ڻԼ�,10\n");
			fw.write("�ڳ���ģ���ڻԼ�");
			fw.close();
			System.out.println("������ ���������� ����Ǿ����ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
