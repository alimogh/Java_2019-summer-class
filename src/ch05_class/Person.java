package ch05_class;

public class Person {
	//�ʵ�(Ư��)
	public String name;
	public int age;
	private String privateNumber;
	
	//������
	public Person() {
		System.out.println("Person: �⺻ ������");
	}
	public Person(String privateNumber) {
		this.privateNumber=privateNumber;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person(String name, int age, String privateNumber) {
		this.name = name;
		this.age = age;
		this.privateNumber = privateNumber;
		System.out.println("Person: �Ű������� ������ ������");
	}
	
	//�޼ҵ�(�ൿ)
	public void speak() {
		System.out.println("���ϱ�");
	}
	public void eat() {
		System.out.println("�Ա�");
	}
	public void walk() {
		System.out.println("�ȱ�");
	}
	public void sleep() {
		System.out.println("���ڱ�");
	}
}
