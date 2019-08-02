package ch08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class F00_Problem03 {
	/*
	 * 	./work/info.txt/ ���� �о�鿩
	 * 	�ڽ��� ���� ���
	 */
	public static void main(String[] args) {
		// File ��ü ����
		// �� ./work/info.txt �� ������ ��ü ����
		File file=new File("./work/info.txt");
		Scanner sc=new Scanner(System.in);
		try {
			// ���� �Է� ��Ʈ��
			BufferedReader br=new BufferedReader(
					new InputStreamReader(
							new FileInputStream(file),"UTF-8"));
			String str;
			// br.readLine()�ǰ��� str�� ������
			// null���� �˻�->null �ƴϸ� ��� �� �Է��� ����
			String name = null;
			String age = null;
			while((str=br.readLine())!=null) {
				System.out.println(str);
				if(str.contains("name"))
					name=sc.next();
				else
					age=sc.next();
			}
			// ���� ��� ��Ʈ��
			BufferedWriter bw=new BufferedWriter(
					new OutputStreamWriter(
							new FileOutputStream(file),"UTF-8"));
			bw.append("My name : ").append(name);
			bw.newLine();
			bw.append("My age : ").append(age);
			
			br.close();
			bw.close();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			System.err.println(e);
		}
		sc.close();
	}
}
