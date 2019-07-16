package ch04_class;
/*
 * Ư��
 * 	�̸�
 * 	�г�
 * 	����
 * �޼ҵ�
 * 	����
 * 	��
 * 	��
 * ������
 * 	�Ű����� ���� ������
 * 	�̸�����
 * 	�̸�,�г�����
 */
public class Student {
	public String name;
	public int grade;
	public int score;
	
	public Student() {}
	public Student(String name) {
		this.name=name;
	}
	public Student(String name,int grade) {
		this(name);
		this.grade=grade;
	}
	
	public void study() {
		System.out.println(name+"("+grade+") study");
	}
	public void eat() {
		System.out.println(name+"("+grade+") eat");
	}
	public void sleep() {
		System.out.println(name+"("+grade+") sleep");
	}
	public void feedAnimal(int feed,String name) {
		System.out.println(name+"�������� "+feed+"��ŭ ���̸� ��");
	}
	public int feedAnimal(int feed,Animal a1) {
		System.out.println(a1.name+"���� "+feed+"��ŭ ���̸� ��");
		return a1.eat(feed);
	}
}
