package Ch03;

import java.util.Scanner;

/*
 * �� �ڿ����� �Է� �޾� ���� ���� ��� ���� ���մϴ�.
 * 
 * �� ��� ���� ���ڰ� ���� ����� ������ּ���
 * 
 * 0���� ���� 0���� ���
 * 
 * 
 * 
 */
public class File0_Problem_03 {

	public static void main(String[] args) {
		int n[]=new int[10];
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt()*sc.nextInt();
		while(a!=0) {
			n[a%10]++;
			a/=10;
		}
		for(int i=0;i<10;i++)
			System.out.println(n[i]);
		sc.close();
	}

}
