package ch01;

import java.util.Scanner;	//�ܺ� Ŭ������ �ش� �ҽ��ڵ忡 �߰�. �ڵ��ϼ�: ctrl+shift+o

/*
 *  �Է�, ���
 *  �Է�: ���α׷� �ܺο��� ������ ����
 *  	Ű����, ����, ���콺 ��
 *  ���: ���α׷� ����->�ܺ� �����Ͱ� ����
 *  	�����, ����Ŀ, ������ ��
 */

public class f03_����� {

	public static void main(String[] args) {
		/*
		 * 	����Ϳ� ���
		 * 		System.out.println();
		 * 			������ ��� �� ����
		 * 			�ڵ��ϼ�: sout->ctrl+space
		 * 		System.out.print();
		 * 			������ ��� �� ������� ����
		 * 			�Ұ�ȣ �ȿ� ������ ���� �����ؾ���.
		 * 		System.out.printf(format,arg);
		 * 	�Է�
		 * 		Scanner Ŭ���� �̿��� Ű����κ��� �Է�
		 */
		System.out.println();
		System.out.print("Hello ");
		System.out.print(123);
		System.out.print(" World");
		
		Scanner sc = new Scanner(System.in);
	}

}
