package com.kh.Hamburger;

public class HamburgerOrder {
//�ʵ�
	private String ����;
	private String ����Ÿ��;

//�޼���
	// ����
	public void setCustomer(String customer) {
		this.���� = ����;
	}

	public void setBurgerType(String burgerType) {
		this.����Ÿ�� = ����Ÿ��;
	}

	// ����
	public String getCustomer() {
		return ����;
	}

	public String getBurgerType() {
		return ����Ÿ��;
	}

//�޼���
	// �ʼ�������
	public HamburgerOrder(String ����, String ����Ÿ��) {
		this.���� = ����;
		this.����Ÿ�� = ����Ÿ��;
	}

	// Override toString alt shift s s
	@Override
	public String toString() {
		return "����=" + ���� + ", ����Ÿ��=" + ����Ÿ�� + "]";
	}

}
