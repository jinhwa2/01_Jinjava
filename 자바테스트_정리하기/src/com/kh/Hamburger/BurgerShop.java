package com.kh.Hamburger;

import java.util.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BurgerShop {
	public static void main(String[] args) {
		// ArryList ��� �ֹ� ����Ʈ
		List<HamburgerOrder> �ֹ�����Ʈ = new ArrayList<>();

		�ֹ�����Ʈ.add(new HamburgerOrder("���׶��", "ġ�����"));
		�ֹ�����Ʈ.add(new HamburgerOrder("�ȼ���", "����������"));
		�ֹ�����Ʈ.add(new HamburgerOrder("�ڳ׸�", "�����̹���"));
		�ֹ�����Ʈ.add(new HamburgerOrder("�ݰ���", "ġŲ����"));
		�ֹ�����Ʈ.add(new HamburgerOrder("���׶��", "���"));

		// toString ��� sysout �ֹ�����Ʈ
		System.out.println(�ֹ�����Ʈ);

		// ArrayList�� ��� �ߺ����� �� ������� �ߺ����� �ֹ����� ���ϰ� �ϰ� �ͽ��ϴ�.
		// HashSet

		System.out.println("���� �ߺ� �ֹ��̽ó׿�!!");
		System.out.println("ó���ֹ��� �ްڽ��ϴ�.^^");

		// HashSet ����ؼ� �ߺ� �ֹ��� �����ϱ� ���� set �ߺ��ֹ�����
		// �ߺ��� �ֹ� ���� �����Ѱ� ���
		Set<String> �ߺ������� = new HashSet<>(); // �ߺ�Ȯ�ο��θ� ���� �ν��Ͻ� ����

		// �ߺ� ���� ������ ������ �ߺ����� ���� ���� ArrayList�� �ٽ� ���
		List<HamburgerOrder> �ߺ������ֹ� = new ArrayList<>();// �ߺ����� ������ ���븸 ���� ����
		// for - each���� Ȱ���ؼ� �ߺ��� �ִ��� �ѹ��� ���鼭 Ȯ���� ����
		// �ߺ��� ���� �ʴ� ���븸 �߱�
		for (HamburgerOrder �ֹ� : �ֹ�����Ʈ) {
			// �����ϴ� ���� �߰��ϰڴ� ��� �ǹ��̱� ������ �߰��� �ȵ�
			// if(�ߺ�������.contains(�ֹ�.getCustomer())) {
			if (!�ߺ�������.contains(�ֹ�.getCustomer())) {// ���� �������� �ʴ´ٸ�
				�ߺ������ֹ�.add(�ֹ�); // �ֹ� ���� �߰�
				�ߺ�������.add(�ֹ�.getCustomer());
			}
		}

		System.out.println(�ߺ������ֹ�); // �ߺ������ֹ����� ó���� �ֹ��� ����Ʈ�� ���� �� �ְԵ�

	}
}
