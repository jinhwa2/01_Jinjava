package Pre.propertiesEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import com.kh.test.main.oop.Main;

public class PropTest {
	public static void fileSave(Properties p) {
		//Properties 에 XML파일로 내용 저장하기
		p.setProperty("1", "패밀리맨,4,2000");
		p.setProperty("2", "엔리멘탈,5,2023");
		p.setProperty("3", "투모로우,5,2004");
		
		try {
			FileOutputStream fos = new FileOutputStream("movies.xml");
			p.storeToXML(fos, "movise is fun.");
			fos.close();
			System.out.println("설정이 movies.xml 파일에 저장되었습니다.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//fileOpen xml파일에 있는 내용 출력///모르모름 실습실습
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
