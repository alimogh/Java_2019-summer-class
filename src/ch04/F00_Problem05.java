package ch04;

import java.util.Scanner;

/*
 * �簢���� ������ ��ǥ���� �־����� �簢���� ���� ����� �Ÿ��� ���ϴ� ���α׷� �ۼ�
 */
public class F00_Problem05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt(),y=sc.nextInt();
		int w=sc.nextInt(),h=sc.nextInt();
		int mx,my;
		mx=(w>2*x)?x:w-x;
		my=(h>2*y)?y:h-y;
		if(mx>my) System.out.println(my);
		else System.out.println(mx);
		sc.close();
	}
}
