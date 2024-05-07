package ncs.test4;

public class Product {
//필드
private String name;
private int price;
private int quantity;

//메서드(순서 바껴도 상관없음)
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


//생성자 기본
public Product() {
	
}
//생성자 필수
public Product(String name, int price, int quantity) {
	this.name = name;
	this.price = price;
	this.quantity = quantity;
}

//return 정보
public String 정보() {
	return "상품명:" + name + ",가격 :"+price+"원, 수량 :"+quantity+"개, 가격:"+price
			+"개, 총 구매가격:"+getPrice();
}

}
