package com.kh.Sandwich;

public class ������ġ {
//�ʵ�
	private String ����;
	private String ������ġ����;

//�޼���
	// ������ �ʼ�
	public ������ġ(String ����, String ������ġ����) {
		super();
		this.���� = ����;
		this.������ġ���� = ������ġ����;
	}

	// Setter
	public void set����(String ����) {
		this.���� = ����;
	}

	public void set������ġ����(String ������ġ����) {
		this.������ġ���� = ������ġ����;
	}

	// Gatter
	public String get����() {
		return ����;
	}

	public String get������ġ����() {
		return ������ġ����;
	}

	// @Override toString ���� ������ġ ���� alt shift s s
	@Override
	public String toString() {
		return "����=" + ���� + ", ������ġ����=" + ������ġ����;

	}

}
