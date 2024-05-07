package ncs.test13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Inventory {
	private String productName; // ��ǰ��
	private Date putDate; // �԰�
	private Date getDate; // ���
	private int putAmount; //�԰����
	private int getAmount; //������
	private int inventoryAmount; //������

//�޼���
	// GetterSetter
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getPutDate() {
		return putDate;
	}

	public void setPutDate(Date putDate) {
		this.putDate = putDate;
	}

	public Date getGetDate() {
		return getDate;
	}

	public void setGetDate(Date getDate) {
		this.getDate = getDate;
	}

	public int getPutAmount() {
		return putAmount;
	}

	public void setPutAmount(int putAmount) {
		this.putAmount = putAmount;
	}

	public int getGetAmount() {
		return getAmount;
	}

	public void setGetAmount(int getAmount) {
		this.getAmount = getAmount;
	}

	public int getInventoryAmount() {
		return inventoryAmount;
	}

	public void setInventoryAmount(int inventoryAmount) {
		this.inventoryAmount = inventoryAmount;
	}

	// �޼���
	// �⺻ ������
	public Inventory() {
		
	}

	// �ʼ�������
	//�ڵ��� �Ϲ� ����� ��� �Ǹſ� �Ǹ��� ���� ���� �� �� ���� ������ ���������
	public Inventory(String productName, Date putDate, int putAmount
		) {
		super();
		this.productName = productName;
		this.putDate = putDate;
		//this.getDate = getDate;
		this.putAmount = putAmount;
		//this.getAmount = getAmount;
		//this.inventoryAmount = inventoryAmount;
	}

	// toStirng @Override
	@Override
	public String toString() {
		
		//��¥ ������ ����
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy�� MM�� dd��");
		
		String ���ڿ���ȯ = dateFormat.format(putDate);
		
		String ����Ϻ�ȯ = dateFormat.format(getDate);
		             //�������  - �Ǹŷ�
		int ������� = putAmount - getAmount;
		
		return "��ǰ��=" + productName 
				+ ", �԰���=" + ���ڿ���ȯ 
				+ ", �����=" + ����Ϻ�ȯ
				+ ", ��ǰ���=" + putAmount
				+ ", �Ǹŷ�=" + getAmount 
				+ ", �Ȱ� ���� ��=" + �������;
	}

}
