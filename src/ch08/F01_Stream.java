package ch08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class F01_Stream {
	/*
	 * 	��Ʈ��: �������� �帧
	 * 		���α׷��� ����� ������ �� ���̿� �帣�µ������� ���
	 * 	��Ʈ�� �����
	 * 		���۸� ���� ���������� �̷������ �����
	 * 	�ڹٿ����� ǥ�� �����
	 * 		�Է�: System.in
	 * 			�Է���ġ�κ��� �ڹ����α׷����� ������ ����
	 * 		���: System.out
	 * 			�����ġ�� ������ ����
	 * 	��Ʈ���� �ܹ���.
	 * 		��/��� ��Ʈ�� ���� ����
	 * 	����� ��Ʈ���� �⺻ ����
	 * 		����Ʈ ��Ʈ��: ����Ʈ(�̹���,���� ��)
	 * 			���ڵ� ���������� ���ڰ� ���� �� ����
	 * 		���� ��Ʈ��: ����(1���ڴ� 2����Ʈ)
	 * 	����Ʈ ��Ʈ���� ���� ��Ʈ��
	 * 		����Ʈ ��Ʈ��
	 * 			����µǴ� �����͸� �ܼ� �����ͷ� ó��
	 * 			�̹���, ����, ���̳ʸ�, ���� ���� ó��
	 * 			���ڰ��� ��� ���� �� ����
	 * 		���� ��Ʈ��
	 * 			���ڸ� ������� �Ǵ� ��Ʈ��
	 * 
	 * 	���� ��Ʈ�� �����
	 * 		��Ʈ������ ���� ����
	 * 		InputStreamReader isr=new InputStreamReader(System.in);
	 * 		int c=isr.read();	�ѱ��ھ� int������ �о��
	 * 		BufferedReader br=new BufferedReader(isr);
	 * 		String str=br.readLine();
	 * 
	 * 		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 * 
	 * 		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	 */
	public static void main(String[] args) throws IOException {
		// ���� ��Ʈ�� ��ü ����
		// ���� �Է� ��Ʈ��
		// ���ڿ��� �Է��� ���� �� ����.
		// ���� �� �Է��� �޾ƿ�.
		// ��������� �����ų�, �ٸ� Ÿ������ �ڷ����� �ٲ� ����
		// �߰������� ������ ����� ��.
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		System.out.println(str);
		
		//�Է¹��� ���ڿ��� ��������� ����
		StringTokenizer st=new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {	//��ū�� ���������� �ݺ�
			str=st.nextToken();
			System.out.println(str);
		}
		
		//�Է¹��� ���ڿ��� �⺻ �ڷ������� ��ȯ
		int n=Integer.parseInt(br.readLine());
		System.out.println(n);
		
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("BufferedWriter Object");
		bw.newLine();
		bw.write("Endline");
		bw.flush();	//���� ���۸� ������ ���
	}
}
