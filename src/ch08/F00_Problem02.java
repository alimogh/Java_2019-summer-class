package ch08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class F00_Problem02 {
	/*
	 * �� �ٷ� �ҹ��ڷ� �̷��� �ܾ�� �Է¹޾� ����� ���ֽø� �˴ϴ�.
	 */
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				sb.append(st.nextToken()).append("\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sb);
		
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			StringTokenizer st1=new StringTokenizer(br.readLine());
			while(st1.hasMoreTokens()) {
				bw.write(st1.nextToken());
				bw.newLine();
			}
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
