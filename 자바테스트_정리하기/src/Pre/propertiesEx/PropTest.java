package Pre.propertiesEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import com.kh.test.main.oop.Main;

public class PropTest {
	public static void fileSave(Properties p) {
		//Properties �� XML���Ϸ� ���� �����ϱ�
		p.setProperty("1", "�йи���,4,2000");
		p.setProperty("2", "������Ż,5,2023");
		p.setProperty("3", "����ο�,5,2004");
		
		try {
			FileOutputStream fos = new FileOutputStream("movies.xml");
			p.storeToXML(fos, "movise is fun.");
			fos.close();
			System.out.println("������ movies.xml ���Ͽ� ����Ǿ����ϴ�.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//fileOpen xml���Ͽ� �ִ� ���� ���///�𸣸� �ǽ��ǽ�
		public static void fileOpen(Properties p) {
			  try {
				FileInputStream fis = new FileInputStream("movies.xml");
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	public static void main(String[] args) {
		Properties p = new Properties();
		fileSave(p);
	}

}
