package com.kh.serverEx;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
/*
 ���� IP�� 192.200.3.52 �� �� ������ �����ϴ� ����� �����ؼ� �ۼ��ϱ�  
 * */

public class IPPort {
	public static void main(String[] args) {
		try {
			String serverIP = InetAddress.getLocalHost().getHostAddress();
			System.out.println(serverIP);
								//serverIP = 192.168.0.22 ���� ��ǻ�� IP�ּ�
			Socket socket = new Socket(serverIP,3000);
			System.out.println(socket);
		
			InetAddress ����IP = InetAddress.getByName("192.200.3.52");
			System.out.println("ȣ��Ʈ�� : "+����IP.getHostName());
			System.out.println("IP�ּ� :"+����IP.getHostAddress());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
