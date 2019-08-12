package multiChatting;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiChatingServer {
	static final int PORT=7777;
	static final ArrayList<Socket> list=new ArrayList<>();
	public static void main(String[] args) {
		try(ServerSocket server=new ServerSocket(PORT)) {
			while(true) {
				// Ŭ���̾��� ������ ���
				Socket client=server.accept();
				
				// ������ �Ǹ� �����  Ŭ���̾�Ʈ�� ����� �����带 ����
				ChattingThread th=new ChattingThread(client);
				th.start();
				
				// �����带 ���� ��Ų �������� �����带 Vector�� ����.
				// �����忡 �ѱ��� �������� ArrayList�� ����.
				list.add(client);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static synchronized void sendAll(String msg, ChattingThread th) throws IOException {
		for(Socket cl:list) {
			if(cl==th.client)continue;
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(cl.getOutputStream()));
			bw.append(msg).append("\n").flush();
			bw.close();
		}
	}
}
