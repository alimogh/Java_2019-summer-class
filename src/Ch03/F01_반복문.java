package Ch03;

import java.util.Scanner;

public class F01_�ݺ��� {
	/*
	 * 	�ݺ���: if�� ���� ��� �� �ϳ�
	 * 	for, while, do-while, for-each
	 * 
	 * 	�ݺ��� ��� ������ �� ���
	 * 
	 * 	for(�ʱ��;���ǽ�;�ݺ� �� �۾�){
	 * 		�ݺ� ������ �۾�
	 * 	}
	 * 	�ʱ��: for���� ����ϱ� ���� ���� ���� �� �ʱ�ȭ
	 * 	���ǽ�: �ݺ� ������ ������ �Ǵ��� �˻��ϴ� ��
	 * 	�ݺ� �� �۾�: �ݺ��۾� �Ϸ� ���� �����ϴ� �۾�
	 * 	�ʱ�-����true-�ݺ��۾�-�ݺ����۾�-����true-�ݺ��۾�-�ݺ����۾�-...-����false-��
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.println((i+1)+". Hello World!");
		}
		
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		int sum=0;
		for(int i=1;i<=10;sum+=i++) {}
		System.out.println("Sum of 1~10: "+sum);
		
		sc.close();
	}

}
