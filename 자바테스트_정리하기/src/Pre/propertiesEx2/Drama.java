package Pre.propertiesEx2;
//implements
public class Drama implements Comparable<Drama> {
	private String name;
	private int ��ó⵵;
	private int ����;
//�޼���	
	//Setter
	public void setName(String name) {
		this.name = name;
	}
	public void set��ó⵵(int ��ó⵵) {
		this.��ó⵵ = ��ó⵵;
	}
	public void set����(int ����) {
		this.���� = ����;
	}
	//Getter  
	public String getName() {
		return name;
	}
	public int get��ó⵵() {
		return ��ó⵵;
	}
	public int get����() {
		return ����;
	}
	

	
	//������ �⺻
	public Drama() {
		// TODO Auto-generated constructor stub
	}
	//������ �ʼ� alt shift s o
	public Drama(String name, int ��ó⵵, int ����) {
		super();
		this.name = name;
		this.��ó⵵ = ��ó⵵;
		this.���� = ����;
	}
	//toString  alt shift s s
	@Override
	public String toString() {
		return "name=" + name + ", ��ó⵵=" + ��ó⵵ + ", ����=" + ���� ;
	}
	
	//compareto  ctrl space
	@Override
	public int compareTo(Drama o) {
		
		return this.name.compareTo(o.name);
	}
	
}
