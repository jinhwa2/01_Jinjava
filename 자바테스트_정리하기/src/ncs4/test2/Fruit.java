package ncs4.test2;
//��
public class Fruit implements Comparable<Fruit> {
	String name;
	int price;
	int quantity;
	
	
	//�⺻������
	public Fruit() {
		// TODO Auto-generated constructor stub
	}
	//�ʼ������� ���ϸ� ���ϰ��� ����
	public Fruit(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	//toString
	
	@Override
	public String toString() {
		return "name=" + name + ", price=" + price + ", quantity=" + quantity;
	}
	
	
	@Override
	public int compareTo(Fruit ���Ϻ�) {
		return this.name.compareTo(���Ϻ�.name);
	}
	
	
}
