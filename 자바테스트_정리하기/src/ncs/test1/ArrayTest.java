package ncs.test1;

public class ArrayTest {
	public static void main(String[] args) {
		int [][] array = {{12, 41, 36, 56, 21}, 
		         {82, 10, 12, 61, 45}, 
		         {14, 16, 18, 78, 65}, 
		         {45, 26, 72, 23, 34}};
		//2���� �迭�� ��� �ִ� �����͵��� �հ�� ���
		double �� = 0;
		int count = 0;
		//for - each �������� �ۼ��ؼ� ���
		for(int[]row : array){
			System.out.println("����");
			for(int num : row) {
				�� +=num;
				count++; //���ڸ� ���� ������ ���߿� ���� ���
			}
		
			//��հ��
		}
		double ��� = �� / count;
		
		System.out.println("�հ�:" +��);
		System.out.println("���: "+���);
		
	}
}
