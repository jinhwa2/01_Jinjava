package com.kh.serverEx;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		int port = 3000;
		
		ServerSocket server;
		
		try {
			server = new ServerSocket(port);
			Socket client = server.accept();
			System.out.println("Ŭ���̾�Ʈ�� �����߽��ϴ�.");
			
			//BufferedReader ���ڸ� �ǽð����� �о����
			BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			//PringtWriter�� ����ؼ� �о�� ���� ����ϱ�
			PrintWriter out = new PrintWriter(client.getOutputStream(),true);
			//���������� ���� �޼��� �����ϱ�
			String m;
			
			while((m = in.readLine()) !=null/*m = �����±��ڸ� �о��µ� ���ڰ� ������� ���� �� true�� ����*/) {
				System.out.println("send seccess :"+m);
				out.print("c h e c k");
				ServerSocket server1 = new ServerSocket();
				System.out.println("hello chat open");
				
				
		
				//Ŭ���̾�Ʈ�� ������ �޼��� �����ְ� ����
			
			}
			client.close();
			server.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
