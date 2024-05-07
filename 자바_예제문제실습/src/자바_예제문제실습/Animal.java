package 자바_예제문제실습;

import java.io.Serializable;

/*
캡슐화 원칙에 맞게 구현하기
//다른데서 사용할수 있으니 직렬화화하기 
*/
public class Animal implements Serializable {
//필드
    private String 동물이름;
    private int 나이;
	
//메서드
    //Getter 
    //Setter
    public void set동물이름(String 동물이름) {
		this.동물이름 = 동물이름;
	}
	public void set나이(int 나이) {
		this.나이 = 나이;
	}
	public String get동물이름() {
		return 동물이름;
	}
	public int get나이() {
		return 나이;
	}
    
    //기본생성자 컨트럴 스페이스 엔터
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	//필수생성자  Alt shift s o
	public Animal(String 동물이름, int 나이) {
		super();
		this.동물이름 = 동물이름;
		this.나이 = 나이;
	}
	
	
	//@Overrde toString 활용해서 문자열 출력하기 Alt shift s s
	@Override
	public String toString() {
		return "동물이름=" + 동물이름 + ", 나이=" + 나이;
	}
	
	
	
	
	
}
