package ch06;

import java.util.Scanner;

public class F00_Problem_02 {
	/*
	 * ���ڿ��ε� ���ڸ� �ΰ� �Է¹޾�
	 * ���� ���� ������ִ� ���α׷� �ۼ�
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String a[]=str.split(" ");
		//int sum=Integer.parseInt(a[0])+Integer.parseInt(a[1]);
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=Integer.parseInt(a[i]);
		}
		System.out.println(sum);
		sc.close();
	}
}
