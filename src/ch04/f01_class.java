package ch04;

//����� ����� ���� Ʋ
class People{
	//�ʵ�(Ư��)
	String name;
	int age;
	
	//�޼ҵ�(���,�ൿ)
	void eat() {
		System.out.println(name+"("+age+") eat");
	}
	void sleep() {
		System.out.println(name+"("+age+") sleep");
	}
}

class pos{
	int x;
	int y;
}

public class f01_class {
	public static void main(String[] args) {
		People p1=new People();
		p1.name="AA";
		p1.age=32;
		
		p1.eat();
		p1.sleep();
		
		People p2=new People();
		p2.name="aa";
		p2.age=23;
		
		p2.eat();
		p2.sleep();
	}
}
