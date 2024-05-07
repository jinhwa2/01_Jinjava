package Pre.propertiesEx2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

//���θ޼���
public class PropTest {
	public static void main(String[] args) {
		Properties p = new Properties();
		//p.fileSave(); -> p �ؿ��� �߰��� �������ų� �ۼ��Ҷ� ����ϴ� ��
		//�޼��带 ���� �������� ������ �� ������� ������� ����
		
		fileSave(p);
		fileOpen(p);
	}

	// fileSave
	public static void fileSave(Properties p) {
		p.setProperty("1", "��ǳ����ΰ�,1998,682");
		p.setProperty("2", "�ȹٷλ�ƶ�,2002,239");
		p.setProperty("3", "�����ǿ���,2024,16");
		p.setProperty("4", "�Ƴ�����Ȥ,2008,129");
		// xml �ؽ�Ʈ ����� ���� ������ �б� ���ϵ��� < > ��Ģ�� �����ؼ� �ۼ��ϴ� ����
		// Properties �� XML���Ϸ� ���� �����ϱ�

		try {
			FileOutputStream fos = new FileOutputStream("Drama.xml");
			p.storeToXML(fos, "Drama is fun");
			fos.close();
			System.out.println("�����Ͱ� drama.xml�� ����Ǿ����ϴ�.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void fileOpen(Properties p) {
		try {
			FileInputStream fi = new FileInputStream("Drama.xml");
			p.loadFromXML(fi); // ���� �����ִ� xml ���� �о����
			fi.close();
			// Properties ��ü�� Ű-���� �־ List ����
			List<Drama> ��󸶵� = new ArrayList<>();
			// ������ �����Ͱ� ��� ����ִ��� �����͸� ���� ����Ʈ�� ����� �ذ�
			// for ������ ���� ���Ͼȿ� �����ִ� �̸��� �������� ��� �߰��ϱ�
			for (String key : p.stringPropertyNames()) {
				// xml ���Ͼȿ� ����ִ� ��� ���� ���ڿ� ���·� �����ؼ� �˻��Ҽ� �ֵ��� ��
				// ��� Ű�� ���� String[]�� �����ؼ� key���� ��� ����� ��, ��������
				String[] values = p.getProperty(key).split(",");
				String name = values[0];
				int ��ó⵵ = Integer.parseInt(values[1]);
				int ���� = Integer.parseInt(values[2]);

				Drama ��� = new Drama(name,��ó⵵,����);
				// ���� ���� ��󸶸� ��� �߰��ϱ�
				// ����ִ� ��󸶵� ����Ʈ�� ������ ��� �߰��ϱ�
				��󸶵�.add(���);
				// ����ִ� ��󸶵��� �ٽ� �����ϰڴ�. �����ϴ� ���� Drama[0] = name

			}
			// ������ �� ���� �����ϴ� ����
			Drama[] ������� = ��󸶵�.toArray(new Drama[0]);
			// Drama[] ������� = ��󸶵�.toArray(new.Drama[1]); // ��ó⵵ ���� ����
			// Drama[] ������� = ��󸶵�.toArray(new.Drama[2]); // ����� ���� ����
			Arrays.sort(�������);

			System.out.println("��󸶸��: ");
			for (Drama d : ��󸶵�) {
				System.out.println(d);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

}
