package ncs.test10;

public class BookUpdate {
//�ʵ�
	private Book å����;
//�޼���
	//Setter
	public void setå����(Book å����) {
		this.å���� = å����;
	}
	//Getter
	public Book getå����() {
		return å����;
	}
	
	
	//������ �⺻
	public BookUpdate() {
		
	}
	//������ �ʼ�
	public BookUpdate(Book å����) {
		super();
		this.å���� = å����;
	}
	
	public void å���ݺ���(){
		double ���ΰ� = å����.getå����() * (1-å����.get������() /100);
		å����.setå����(���ΰ�);
	}
	
	
	
}
