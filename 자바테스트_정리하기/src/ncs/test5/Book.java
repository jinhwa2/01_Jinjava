package ncs.test5;

public class Book {
//�ʵ� ��������
	private String title;
	private String author;
	private int price;
	private String publisher;
	private double discoutnRate;
	
	//�޼���
	//�⺻ ������
	public Book() {
	
	}
	//�ʼ�������
	public Book(String title, String author, int price, String publisher, double discoutnRate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.discoutnRate = discoutnRate;
	}

	//GetterSetter
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setDiscoutnRate(double discoutnRate) {
		this.discoutnRate = discoutnRate;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public String getPublisher() {
		return publisher;
	}
	public double getDiscoutnRate() {
		return discoutnRate;
	}
	//�������� ���󰡰��� Ȯ���ؼ� ���ΰ��� �˰� ���� �� �ۼ��ϴ� �޼���
	public int get���ΰ�() {
		//�����ϴ� ��� ��� �Ǽ�
		double discountAmout = price * discoutnRate;//������� 100�� 10%�Ǹ��ϰڴ�.10���� ��
		//���� -% ��ŭ ������ �� �ݾ�
		//
		int ���ΰ��� = (int)(price -discountAmout );
		return ���ΰ���;
	}
	
	//toString String
	@Override
	public String toString() {
		return "title=" + title + ", author=" + author + ", price=" + price + ", publisher=" + publisher
				+ ", discoutnRate=" + discoutnRate ;
	}











}
