package ch05_class;

public class Student extends Person{
	/*
	 * ����Ŭ������ ����Ŭ�������� ���� �̸����� �� �ʵ尡 ������ �켭������ ����Ŭ������ �ʵ尡 ����
	 */
	
	//������
	public Student() {
		System.out.println("Student: �⺻ ������");
	}
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println("Student: �Ű������� �ִ� ������");
	}
	public Student(String name,int age,String privateNumber) {
		super(name,age,privateNumber);
//		this.name=name;
//		this.age=age;
		System.out.println("Student: �Ű������� �ִ� ������");
	}
	
	
	public String toString() {
		return name+" : "+age;
	}
}
