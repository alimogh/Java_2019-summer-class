package ch03;

import java.util.Scanner;

public class F06_conticue_break {
	/*
	 * 	�ݺ����� �帧 ����
	 * 	break;		�ݺ��� �ٷ� ����(�ַ� ���ǹ��� �Բ� ���)
	 * 	continue;	������ ��� �������� �ʰ� ���� �ݺ����� �Ѿ
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int sum=0;
//		while(true) {
//			int n=sc.nextInt();
//			if(n==-1) break;
//			sum+=n;
//		}
//		System.out.println(sum);
		for(int i=0;i<100;i++) {
			if(i%2==1) continue;
			System.out.println(i);
		}
		sc.close();
	}

}
