package ch01;

import java.util.Scanner;	//�ܺ� Ŭ������ �ش� �ҽ��ڵ忡 �߰�. �ڵ��ϼ�: ctrl+shift+o

/*
 *  �Է�, ���
 *  �Է�: ���α׷� �ܺο��� ������ ����
 *  	Ű����, ����, ���콺 ��
 *  ���: ���α׷� ����->�ܺ� �����Ͱ� ����
 *  	�����, ����Ŀ, ������ ��
 */

public class F03_����� {

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
		 * 
		 * 	�Է�
		 * 		Scanner Ŭ���� �̿��� Ű����κ��� �Է�
		 * 			.nextLine()		���ڿ�. �� �� �Է�
		 * 			.next()			���ڿ�. �� �ܾ� �Է�(����, ��, ���� ����)
		 * 			.nextInt()		������. ����, ��, ���� ���� �Է�
		 * 			.nextDouble()	�Ǽ���. ����, ��, ���� ���� �Է�
		 * 			.nextBoolean()	����. ����, ��, ���� ���� �Է�
		 * 			.intByte() .intShort() ���������� �� ������� ����
		 * 			**�ٸ� Ÿ���� �Է��Լ��� ���� ��� ���� �߻�
		 * 			**.nextLine()�� ȥ���� ����� ��� �Է��� ����� �ȵ� ���� �ִ�.
		 * 				���� �Է��� �� �Է¹��ۿ� ����, ��, ������ �����ִ�.
		 * 				->���� �Է��� ���� ���� �Է��� �ƴ� ��� .nextLine()���� ������ ���� �����ְ� �ٽ� �Է��� �޴´�.
		 * 		�������� .close() ���� System.in �ݾ��ֱ�
		 * 		.hasNextInt(): ���ۿ� ���������� �� �Է¹��� ���� �ִ���
		 */
		System.out.println();
		System.out.print("Hello ");
		System.out.print(123);
		System.out.print(" World");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է����ּ���: ");
		String str = sc.nextLine();	//�Է��� �� ���� �о��
		System.out.println("�Է��� ��: " + str);
		
		int num = sc.nextInt();
		System.out.println("num: " + num);
		int num2 = sc.nextInt();
		System.out.println("num2: " + num2);
		int num3 = sc.nextInt();
		System.out.println("num3: " + num3);
		
		sc.nextLine();
		String str1 = sc.nextLine();
		System.out.println("str1: " + str1);
		
		System.out.println("re");
		String str2 = sc.nextLine();
		System.out.println(str2.getBytes());
		
		sc.close();
	}

}
