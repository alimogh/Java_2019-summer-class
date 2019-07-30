package ch07;

import java.util.ArrayList;
import java.util.Collections;

public class F05_Collections {
	/*
	 * Collections : �÷����� ����� ������ �ִ� Ŭ����
	 * 
	 *  ����, ���� ��ġ, 2��Ž��
	 *  
	 *  Collections�� �ִ� ����(sort)�� CompareTo �޼ҵ��� ���� ���� ���� �̷���
	 *  
	 *  ���Ƿ� �ۼ��� Ŭ������ �����Ϸ���
	 *  Compareable<T> �������̽��� ��ӹ޾�
	 *  compareTo �޼ҵ� ����
	 *  	���ϰ�	����	: ����
	 *  			0		: ����
	 *  			���	: ū
	 */
	public static void main(String[] args) {
		ArrayList<Pos> list=new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			int x=(int)(Math.random()*21);
			int y=(int)(Math.random()*21);
			list.add(new Pos(x,y));
		}
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
	}
}