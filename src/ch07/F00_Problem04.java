package ch07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MySort implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		if(str1.length()!=str2.length())
			return str1.length()-str2.length();
		return str1.compareTo(str2);
	}
	
}

public class F00_Problem04 {
	/*
	 * ���ڿ��� �����ϴ� ArrayList ��ü�� �����ϰ�
	 * ArrayList�� �ҹ��ڷ� �̷��� ���ڿ��� ������ �մϴ�.
	 * 
	 * �׸��� ���� ���� ���� ������ ������ �ϰ�
	 * ���� ���� ������ ���������� ������ �� ��
	 * ����� �ϼ���.
	 * 
	 * �ڹٿ��� �����ϴ� Ŭ������ ��ü�� ���� ���ϴ� ���� ������� ������ �ϰų�
	 * ������ Ŭ������ ��ü�� ���� ���� ���Ĺ���� �ٲ� �� ����ϴ� ���.
	 */
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("hi");
		list.add("is");
		list.add("hello");
		list.add("world!");
		list.add("javaprogram");
		
		//���������� ����
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list,new MySort());
		System.out.println(list);
//		Collections.sort(list, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return 0;
//			}
//			
//		});
	}
}
