package ch05_class;

public class Researcher extends Person{
	public Researcher(String name,int age) {
		super(name,age);
	}
	
	@Override
	//@Deprecated
	public void sleep() {
		System.out.println("�� ���ڰ� �����ϱ�");
	}
}
