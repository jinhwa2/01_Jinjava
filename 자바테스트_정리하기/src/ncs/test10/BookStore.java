package ncs.test10;

public class BookStore {
//main �޼���
	public static void main(String[] args) {
		/*
		 Book å����; 
		      å���� = new Book("IT", "HTML5", 30000.0, 15.0);
		  
		 Book å����= new Book("IT", "HTML5", 30000.0, 15.0);
		 
		 �ڷ��� ������ = ���ͷ�(��); //�޸� ����� ����
		 
		 �ڷ��� ������;
		 ������ = ���ͷ�(��);  // �޸� ����� ������ �ۼ��� �ͺ��� ���� �� ���
		  */
		
		
		
		
		
		
		Book å����;
		
		å���� = new Book("IT", "HTML5", 30000.0, 15.0);
		System.out.println("�⺻����");
		System.out.println(å����.getå�̸�() + " "+å����.getå����());
		
		BookUpdate �������� = new BookUpdate(å����);
		
		��������.å���ݺ���();
		System.out.println("����� ��������");
		System.out.println(å����.getå�̸�()+" "+å����.getå����());
	}
}
