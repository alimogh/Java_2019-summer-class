package ch03;

import java.util.Scanner;

public class F03_while {
	/*
	 * 	while: for���� ���� �ݺ���
	 * 
	 * 	while(���ǽ�){
	 * 	}
	 * 
	 * 	for(int i=0;i<n;i++){		|	int i=0;
	 * 		sum+=i;					|	while(i<100){
	 * 	}							|		sum+=i++;
	 * 								|	}
	 * 	�ݺ��Լ�, �迭�� ����		|	Ư�� ���ǿ� ���ø� �� �� �ַ� ���
	 * 	����Ž�� ��ɿ� �ַ� ���	|
	 * 
	 * 	do-while
	 * 	while��ó�� ���ǽĿ� ������ �δµ�
	 * 	while���� �������� do while �ּ� 1�� ����
	 * 
	 * 	do{
	 * 	}while(���ǽ�);
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n!=0) {
			sum+=n;
			n=sc.nextInt();
		}
		
		int m,s=0;
		do {
			m=sc.nextInt();
			s+=m;
		}while(m!=0);
		
		sc.close();
	}

}