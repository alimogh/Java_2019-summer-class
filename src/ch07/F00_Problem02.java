package ch07;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "("+name+":"+age+")";
	}
	
	@Override
	public boolean equals(Object o) {
		Person p=(Person)o;
		if(this.name.equals(p.name)&&this.age==p.age)
			return true;
		return false;
	}

	@Override
	public int compareTo(Person p) {
		if(this.age!=p.age)
			return this.age-p.age;
		return this.name.compareTo(p.name);
	}
}

public class F00_Problem02 {

	/*
	 * ����� �̸��� ���̸� �����ϴ� Ŭ����(Person)��
	 * �ۼ��� ���ֽð�
	 * 
	 * Person�� ��ü�� �����ϴ� ArrayList�� ����� �ֽø� �˴ϴ�.
	 * 
	 * ������ �ϴµ� ������ ���̼�(��������), ���̰� ������
	 * �̸� ���� ������ ������ ������ 
	 * "�̸� : ����" ���ڿ��� ���
	 * 
	 */
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();
		
		list.add(new Person("KGH",20));
		list.add(new Person("LLL",25));
		list.add(new Person("KKL",32));
		list.add(new Person("PAK",25));
		list.add(new Person("LSH",30));
		list.add(new Person("ELS",42));
		list.add(new Person("AHH",21));
		list.add(new Person("XHL",20));
		list.add(new Person("QWO",23));
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Person p1=new Person("PAK",25);
		System.out.println(list.contains(p1));
	}
}