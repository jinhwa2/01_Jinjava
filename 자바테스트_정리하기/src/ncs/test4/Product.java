package ncs.test4;

public class Product {
//�ʵ�
private String name;
private int price;
private int quantity;

//�޼���(���� �ٲ��� �������)
//Getter
//Setter
public String getName() {
	return name;
}
public int getPrice() {
	return price;
}
public int getQuantity() {
	return quantity;
}
public void setName(String name) {
	this.name = name;
}
public void setPrice(int price) {
	this.price = price;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}


//������ �⺻
public Product() {
	
}
//������ �ʼ�
public Product(String name, int price, int quantity) {
	this.name = name;
	this.price = price;
	this.quantity = quantity;
}

//return ����
public String ����() {
	return "��ǰ��:" + name + ",���� :"+price+"��, ���� :"+quantity+"��, ����:"+price
			+"��, �� ���Ű���:"+getPrice();
}

}
