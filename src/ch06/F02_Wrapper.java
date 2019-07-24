package ch06;

import java.util.Scanner;

public class F02_Wrapper {
	/*
	 * Wrapper Ŭ����
	 *  8���� �⺻ �ڷ����� ���� Ŭ������ ����� ���� Ŭ�������� ����
	 *  - Wrapper Ŭ������ ������ �������� ����.
	 *  
	 *  ���ڿ� -> �ڷ���
	 *  �ڷ��� -> ���ڿ�
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String intStr="1234";
		String doubleStr="123.25";
		int num=Integer.parseInt(intStr);
		System.out.println(num+10000);
		double f1=Double.parseDouble(doubleStr);
		System.out.println(f1);
		
		intStr=sc.next();
		num=Integer.parseInt(intStr);
		
		//Wrapper Ŭ������ ��ü
		//JAVA 5
		//�ڽ�
		Integer objInt=new Integer(10);
		objInt=Integer.valueOf(10);
		sc.close();
		
		//��ڽ�
		num=objInt.intValue();
		
		//JAVA 5 ����
		objInt=10;	//�ڵ��ڽ�
		num=objInt;	//�ڵ���ڽ�
		
		String str = "Kimna/15/2/11/2/";
		str.split("/"); // -> ���� �κ��� Wrapper Ŭ������ ��ȯ �� ���
	}
}
