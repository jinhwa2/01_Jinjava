package com.kh.serverEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
/*
������ ���� �ȳ��ϼ���. �޼��� �������� ���� �� Ŭ���̾�Ʈ �ڵ����� ����ǰ� �ڵ� �ۼ�
 */
public class Client {
	public static void main(String[] args) {
		int port = 3000;
		String ����Ip;
		
		try {
			����Ip = InetAddress.getLocalHost().getHostAddress();
			Socket socket = new Socket(����Ip, port);
			System.out.println("������ ����ƽ��ϴ�.");
			
			//Buffer �Է��� ���� �������� PrintWriter ����ϱ�
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
			
			//�����ڿ��� �޼��� ����
		    out.print("hi serveRRR");
		    
		    //�����ڿ��� �� �޼��� ���� �� ���
		    String m = in.readLine();
		    System.out.println("send seccess :"+m);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
}
