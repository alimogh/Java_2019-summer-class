package ch06;

import java.util.Scanner;

public class F00_Problem_06 {
	/*
	 * up&down
	 * 1~100 ������ ���� ������ �����ϰ� ���ߴ� ����
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=(int)(Math.random()*100+1),s,i=1;
		while(n!=(s=sc.nextInt())) {
//			if(s<n)
//				System.out.println("UP");
//			else
//				System.out.println("DOWN");
			System.out.println((s<n)?"UP":"DOWN");
		}
		System.out.println("answer: "+n);
		sc.close();
	}
}
