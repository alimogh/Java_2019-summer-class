package ch03;

import java.util.Scanner;

/*
 * 2920 
 * 1���� 8���� �ߺ����� �ʰ� ���� �� �Է¹��� ��
 * �Է� ���� ���� �������� ���� ������������ �Ǵ� �� �� �ƴ���
 * �Ǻ��ϴ� ���α׷��� �ۼ�
 */
public class File0_Problem_05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[8];
		for(int i=0;i<8;i++)
			a[i]=sc.nextInt();
		int j=0;
	    for(int i=1;i<8;i++) {
	    	if(a[i-1]<a[i]) j++;
	    	else j--;
	    }
	    switch(j){
	        case 7: System.out.println("ascending");break;
	        case -7: System.out.println("descending");break;
	        default: System.out.println("mixed");
	    }
		sc.close();
	}
}
