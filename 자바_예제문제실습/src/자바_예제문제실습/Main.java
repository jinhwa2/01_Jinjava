package �ڹ�_���������ǽ�;

import java.util.Scanner;

/*
����ڿ��� ���ڿ��� �Է¹޾� ���ڿ��� ���̸� ����ϱ�
�Է��� ���ڿ��� finish �� ���α׷� �����ϰ� �ϱ� ����

 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("���ڿ��� �Է����ּ���.");
			String str = sc.nextLine();
			if (str == "finish") {//finish �־����� ���߰� ����
			} else {
				System.out.println(str.length() + " ���� �Դϴ�.");
				//.length() ���ڿ��� ���� ���ڼ� ��ȯ�޼���
			}
		
			System.out.println("���α׷��� �����մϴ�.");
			break;
		}
	}

}
