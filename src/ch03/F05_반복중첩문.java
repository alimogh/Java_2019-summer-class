package ch03;

import java.util.Scanner;

public class F05_�ݺ���ø�� {
	/*
	 * 	��ø��: ��ȣ �ȿ� ��ȣ
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				System.out.print("* ");
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
		
		sc.close();
	}

}
