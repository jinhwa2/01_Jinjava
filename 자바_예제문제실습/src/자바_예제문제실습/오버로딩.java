package 자바_예제문제실습;
/*
 빨간선이 뜨는 부분을 해결하기 
★★★★★★★★너무 중요하다
*/
public class 오버로딩 {
	public void test() {}
	public void test(String str ) {}
	public void test(int i, int a) {}
	public void test(String s, short b) {}
	
	public void test(int a) {}
	public void test(char a, long b) {}
	
	void test(char ch) {}
	
	public void test(boolean a, String b) {}
	public void test(boolean b) {}
	public void test(short s, long c) {}
	public void test(short c) {}
	
	
	public void test(String a, int b) {}
	public void test(int a, String b) {}
	
	public void tet(String c, String b) {}
	public void test(String c, long b) {}
	
	public void test(boolean a, int b) {}
	public void test(boolean a, boolean b) {}
}

