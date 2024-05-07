package ncs.test4;

import java.util.Scanner;

public class ProductTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("상품이름을 입력하세요: ");
		String name = sc.nextLine();
		System.out.print("상품가격을 입력하세요: ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.print("상품수량을 입력하세요: ");
		int quantity = Integer.parseInt(sc.nextLine());
		
		
		// 입력받은 제품 객체 product 넣은 후 생성 및 초기화
		Product 상품 = new Product(name,price,quantity);
		//상품 정보 출력
		System.out.println(상품.정보());
		
	}
	
}
