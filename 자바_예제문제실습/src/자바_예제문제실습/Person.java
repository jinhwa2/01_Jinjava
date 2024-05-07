package 자바_예제문제실습;
/*
캡슐화
String 사람이름 김영희
int 나이 10
생성자 모두 만들기
toString

 PersonMain person.txt
 * */
public class Person {
 //필드
	private String 사람이름;
	private int 나이;
	
//메서드 Getter Setter	
	public void set사람이름(String 사람이름) {
		this.사람이름 = 사람이름;
	}
	public void set나이(int 나이) {
		this.나이 = 나이;
	}
	public String get사람이름() {
		return 사람이름;
	}
	public int get나이() {
		return 나이;
	}
	
	//기본생성자
	public Person() {
	// TODO Auto-generated constructor stub
}	
	//필수생성자
	public Person(String 사람이름, int 나이) {
		this.사람이름 = 사람이름;
		this.나이 = 나이;
	}
	
	@Override
	public String toString() {
		return "사람이름=" + 사람이름 + ", 나이=" + 나이;
	}
	
	public void fileSave() {
		
	}
}
