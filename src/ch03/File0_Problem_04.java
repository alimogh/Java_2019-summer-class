package ch03;

import java.util.Scanner;

/*
 * 3052
 * �� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. 
 * ���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 
 * �� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. 
 * �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

public class File0_Problem_04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a[]=new int[42];
        int n=0;
        for(int i=0;i<10;i++)
            a[sc.nextInt()%42]=1;
        for(int i=0;i<42;i++)
            n+=a[i];
        System.out.println(n);
        sc.close();
	}
}
