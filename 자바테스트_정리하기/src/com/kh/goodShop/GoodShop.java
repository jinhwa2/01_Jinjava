package com.kh.goodShop;

import java.util.HashMap;
import java.util.Map;

public class GoodShop {
	public static void main(String[] args) {
		Map<String, Integer> ������ = new HashMap<>();

		System.out.println("�������. ���ֿ� ���� ���� ȯ���մϴ�.^^");

		// ��ǰ�� �����߰�
		������.put("�������", 20000);
		������.put("���ָ���", 15000);
		������.put("�����Ű��", 25000);

		// ���� ��� ���� Map.Entry
		// Map<String,Integer> = Map.Entry<�ȿ� ����ִ� Ÿ���� Map�� �����ؾ���>
		// �������� �ϳ��� Ű-������ �������� : �ȿ� ����ִ� ������ ��� ����
		for (Map.Entry<String, Integer> e : ������.entrySet()) {
			String ��ǰ = e.getKey(); // ��ǰ�� ������
			int ���� = e.getValue(); // ��ǰ ���ݸ� ������
			System.out.println(��ǰ + " �� " + ���� + " �Դϴ�.");
		}
		// Ư�� ��ǰ�� ���ݺ���
		System.out.println("�����~! �̰� ���ΰ���~!");
		String ��ǰ�� = "�����ں���";
		// ������ ������ �ִ��� Ȯ���ϰ� ������ �ֱ���
		// �������� �����ۿ��� �մ��� ã�� ��ǰ���� �Ǹ��ϱ� ���� �����ϴ��� Ȯ���ϱ�
		if (������.containsKey(��ǰ��)) { // �������� �Ǹŷ� �����Ѵٸ�
			int ��ǰ���� = ������.get(��ǰ��); // �����ں����� �˻������� �����ϸ� ���� ��������
			System.out.println(��ǰ�� + " �� ������ " + ��ǰ���� + "��");
		} else { // �Ǹ����� �ƴϰų� ���ÿ븸 ������ ���
			System.out.println(��ǰ�� + " ��(��) ���ÿ����� �Ǹ��ϴ� ��ǰ�� �ƴմϴ�.");
		}
	}
}
