package ncs.test5;

public class BookArrayTest {
	public static void main(String[] args) {
		Book bArray [] = new Book[3];
		bArray[0] = new Book("�ڹ�������","���ü�",30000,"��������",0.1);
		bArray[1] = new Book("�������� �ڹ�","������",29000,"������",0.1);
		bArray[2] = new Book("��ü���� JAVA8","�ݿ���",30000,"�Ͻ�Ȩ",0.1);
		/*
		 java.lang.NullPointerException: Cannot invoke "ncs.test5.Book.getTitle()" because "��" is null
		 �ڸ��� ���������� �ڸ��ȿ� ���� ���� �� �߻��ϴ� ����
		 */
		//for-each���� ����ؼ� ���
		for(Book �� : bArray) {
			System.out.println("Title : "+��.getTitle());
			System.out.println("Athor : "+��.getAuthor());
			System.out.println("price : "+��.getPrice());
			System.out.println("publicsher : "+��.getPublisher());
			System.out.println("disconutRet : "+��.getDiscoutnRate());
			System.out.println("���ε� ���� :"+��.getDiscoutnRate());
	        System.out.println("================================");
			
		}
	}
}
