package ch04_class;
//javadoc
/**
 * 
 * @author Administrator
 * ������ ������ �����ϴ� Ŭ����
 */
public class Animal {
	public String kind;
	public String name;
	public int age=0;
	
	//������
	public Animal() {System.out.println("�⺻ ������");}
	public Animal(String kind, String name, int age) {
		this(kind,name);
		this.age = age;
	}
	public Animal(String kind) {
		this.kind = kind;
	}
	public Animal(String kind,String name) {
		this.kind=kind;
		this.name=name;
	}
	
	public int eat(int food) {
		System.out.println(name+": �� �Ա�");
		food-=10;
		return food;
	}
	
	public void eat() {
		System.out.println("I'm starving.");
	}
}
