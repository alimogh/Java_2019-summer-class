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
}
