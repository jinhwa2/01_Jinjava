package Pre.propertiesEx2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

//메인메서드
public class PropTest {
	public static void main(String[] args) {
		Properties p = new Properties();
		//p.fileSave(); -> p 밑에서 추가로 가져오거나 작성할때 사용하는 것
		//메서드를 따로 만들어줬기 때문에 위 방법으로 사용하지 않음
		
		fileSave(p);
		fileOpen(p);
	}

	// fileSave
	public static void fileSave(Properties p) {
		p.setProperty("1", "순풍산부인과,1998,682");
		p.setProperty("2", "똑바로살아라,2002,239");
		p.setProperty("3", "눈물의여왕,2024,16");
		p.setProperty("4", "아내의유혹,2008,129");
		// xml 텍스트 기반의 문서 웹에서 읽기 편하도록 < > 규칙을 지정해서 작성하는 공간
		// Properties 에 XML파일로 내용 저장하기

		try {
			FileOutputStream fos = new FileOutputStream("Drama.xml");
			p.storeToXML(fos, "Drama is fun");
			fos.close();
			System.out.println("데이터가 drama.xml에 저장되었습니다.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void fileOpen(Properties p) {
		try {
			FileInputStream fi = new FileInputStream("Drama.xml");
			p.loadFromXML(fi); // 글이 적혀있는 xml 파일 읽어오기
			fi.close();
			// Properties 객체에 키-값을 넣어서 List 저장
			List<Drama> 드라마들 = new ArrayList<>();
			// 눈으로 데이터가 어떻게 들어있는지 데이터를 담을 리스트를 만들어 준것
			// for 문으로 설정 파일안에 적혀있는 이름을 기준으로 모두 추가하기
			for (String key : p.stringPropertyNames()) {
				// xml 파일안에 들어있는 모든 값을 문자열 형태로 변경해서 검색할수 있도록 함
				// 모든 키를 담을 String[]을 생성해서 key들을 모두 담아줌 단, 기준으로
				String[] values = p.getProperty(key).split(",");
				String name = values[0];
				int 출시년도 = Integer.parseInt(values[1]);
				int 부작 = Integer.parseInt(values[2]);

				Drama 드라마 = new Drama(name,출시년도,부작);
				// 각각 담은 드라마를 모두 추가하기
				// 비어있는 드라마들 리스트에 각각의 드라마 추가하기
				드라마들.add(드라마);
				// 담겨있는 드라마들을 다시 정렬하겠다. 정렬하는 기준 Drama[0] = name

			}
			// 정렬을 할 때는 정렬하는 기준
			Drama[] 드라마정렬 = 드라마들.toArray(new Drama[0]);
			// Drama[] 드라마정렬 = 드라마들.toArray(new.Drama[1]); // 출시년도 기준 정렬
			// Drama[] 드라마정렬 = 드라마들.toArray(new.Drama[2]); // 몇부작 기준 정렬
			Arrays.sort(드라마정렬);

			System.out.println("드라마목록: ");
			for (Drama d : 드라마들) {
				System.out.println(d);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

}
