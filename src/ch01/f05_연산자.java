package ch01;

/*
 *  �� ��ȯ(Ÿ�Ժ�ȯ): ������ ������ ��ȯ
 * 		�ڵ� �� ��ȯ: �����Ϸ�
 * 			����Ÿ�Կ��� ū Ÿ������ ��ȯ
 * 		���� �� ��ȯ: ������
 * 			ū Ÿ�Կ��� ����Ÿ������ ��ȯ
 * 			����, ������ �տ� (������ Ÿ��) �ۼ�
 * 			double->int: �Ҽ����� ������
 * 
 * 	������
 * 		
 */

public class f05_������ {

	public static void main(String[] args) {
		int num=20;
		long longnum=num;
		//byte bytenum=(byte)num;
		System.out.println(longnum);
		System.out.println((double)7/4);
		
		int num1 = 10;
		int num2 = 20;
		int res = num1++ + ++num2;
		System.out.println(res);
		
		int shiftNum = -1;
		System.out.println(shiftNum << 1);
		System.out.println(shiftNum << 2);
		System.out.println(shiftNum << 3);
		System.out.println(shiftNum << 4);
		
		System.out.println(shiftNum >> 1);
		System.out.println(shiftNum >>> 1);
		
	}

}
