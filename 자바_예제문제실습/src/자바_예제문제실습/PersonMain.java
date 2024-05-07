package 자바_예제문제실습;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PersonMain {
	public static void main(String[] args) {
		PersonMain 사람메인파일만들기 = new PersonMain();
		사람메인파일만들기.fileSave("김영희씨인적사항.txt");
		
		
	}
	public void fileSave(String 파일이름/*추후 저장할 파일 이름*/) {
		//File FileWriter bufferedWriter 사용해서 파일 작성하고 저장
		
		File file = new File(파일이름/*추후 저장할 파일이름*/);
		
		try {
			FileWriter fw = new FileWriter(파일이름);
			BufferedWriter bw = new BufferedWriter(fw);
			
			Person 사람 = new Person("김영희",10);
			bw.write(사람.toString());
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		}
}
