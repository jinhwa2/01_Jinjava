package Pre.propertiesEx;

public class Movies implements Comparable<Movies> {
//�ʵ�  
	private String name;
	private int ����;
	private int ������;

	// Setter
	public void setName(String name) {
		this.name = name;
	}

	public void set����(int ����) {
		this.���� = ����;
	}

	public void set������(int ������) {
		this.������ = ������;
	}

//Getter
	public String getName() {
		return name;
	}

	public int get����() {
		return ����;
	}

	public int get������() {
		return ������;
	}

//�޼���
	// �⺻������
	public Movies() {

	}

	// �ʼ�������
	public Movies(String name, int ����, int ������) {
		super();
		this.name = name;
		this.���� = ����;
		this.������ = ������;
	}

	// toString
	@Override
	public String toString() {
		return "name=" + name + ", ����=" + ���� + ", ������=" + ������ ;
	}

	// compareTo ����Ű>ctrl space �� �� return�ڿ� �ۼ�
	@Override
		public int compareTo(Movies o) {
			//�񱳴� ������ ����� ������ ���ϱ� ���� ó���� 0
			return this.name.compareTo(o.name);
		}

}
