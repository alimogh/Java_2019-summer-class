package chatting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

//������ Ŭ���̾�Ʈ���� 1 : 1 ���
public class ChattingServer {
	static final int PORT=7777;
	static ServerSocket server=null;
	// ��Ʈ��ũ ����� ���� ��Ʈ��
	static BufferedReader recive=null;
	static BufferedWriter send=null;
	// ǥ���Է� ��Ʈ��
	static BufferedReader input=null;
	ArrayList<Thread> list = new ArrayList<>();
	public static void main(String[] args) {
		try {
			serverOpen();
			Socket client=null;
			while(true) {
				client=server.accept();
				createStream(client);
				while(true) {
					String msg=reciveMsg();
					if(msg.equals("exit")) break;
					System.out.println("client: "+msg);
					sendMsg("echo "+msg);
				}
				closeStream(client);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void closeStream(Socket client) throws IOException {
		send.close();
		recive.close();
		client.close();
	}
	
	private static void createStream(Socket client) throws IOException {
		send=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
		recive=new BufferedReader(new InputStreamReader(client.getInputStream()));
	}
	
	static void serverOpen() throws IOException{
		server = new ServerSocket(PORT);
	}

	// �޼����� ����(����)�ϴ� �޼ҵ�
	static void sendMsg(String msg) throws IOException {
		send.append(msg).append("\n").flush();
	}

	// �޼����� ���� �޾Ƽ� ��ȯ�ϴ� �޼ҵ�
	static String reciveMsg() throws IOException{
		return recive.readLine();
	}
}
