package ch04;

import ch04_class.Calculator;

public class f00_Problem02 {
	/*
	 * 2���� �ǿ�����, 3���� �ǿ����ڸ� ����� �� �ִ�
	 * ���� Ŭ���� �ۼ��� main���� ������ �� �ֵ��� �ۼ�
	 */
	public static void main(String[] args) {
		Calculator ca=new Calculator();
		System.out.println(ca.sum(1,2,3,4,5,6));
		System.out.println(ca.sum(1,2,3));
		System.out.println(ca.sum(1,2,3,4,5,6,7,8));
		System.out.println(ca.sum(1,2,3,4,5));
	}
}
