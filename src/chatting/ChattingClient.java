package chatting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChattingClient {
	static final String HOST="127.0.0.1";
	static final int PORT=7777;
	static ServerSocket server=null;
	// ��Ʈ��ũ ����� ���� ��Ʈ��
	static BufferedReader recive=null;
	static BufferedWriter send=null;
	public static void main(String[] args) {
		try(Socket client=new Socket(HOST,PORT);BufferedReader input=new BufferedReader(new InputStreamReader(System.in))) {
			createStream(client);
			while(true) {
				String msg = input.readLine();
				sendMsg(msg);
				if(msg.contentEquals("exit"))break;
				
				msg = reciveMsg();
				System.out.println(msg);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				closeStream();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private static void closeStream() throws IOException {
		send.close();
		recive.close();
	}
	
	private static void createStream(Socket client) throws IOException {
		send=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
		recive=new BufferedReader(new InputStreamReader(client.getInputStream()));
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
