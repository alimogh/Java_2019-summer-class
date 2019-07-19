package ch05;

import ch05_class.Person;
import ch05_class.Researcher;
import ch05_class.Student;
import ch05_class.StudentWorker;

public class F03_ĳ���� {
	/*
	 * ĳ����(����ȯ)
	 * 
	 * �ڷ��� ��ȯ
	 * 	��������ȯ: �����ڷ���->ū�ڷ���
	 * 	��������ȯ: ū�ڷ���->�����ڷ���
	 * 
	 * ��ü ����ȯ
	 * 	��Ӱ��迡���� ����
	 * 	�� ĳ����: Ŭ���� Ÿ���� ����Ŭ���� Ÿ������ ��ȯ��Ŵ
	 * 		�ڵ� ĳ����
	 * 	�ٿ� ĳ����: Ŭ���� Ÿ���� ����Ŭ���� Ÿ������ ��ȯ��Ŵ
	 * 		���� ĳ���� (����Ŭ����)��ü�̸�
	 * 		����Ŭ������ ��ü�� ��ĳ������ �� ��ü���� ��
	 */
//	public static void printInfo(Student s) {
//		System.out.println(s.name+", "+s.age);
//	}
//	public static void printInfo(Researcher s) {
//		System.out.println(s.name+", "+s.age);
//	}
	public static void printInfo(Person s) {
		if (s instanceof Person) {
			System.out.println("Person type");
		}
		if (s instanceof Student) {
			System.out.println("Student type");
			System.out.print("�л�: ");
		}
		else if (s instanceof Researcher) {
			System.out.println("Researcher type");
			System.out.print("������: ");
		}
		System.out.println(s.name+", "+s.age);
	}
	
	public static void main(String[] args) {
		Student s=new Student("abc",5);
		Person p=s;	//��ĳ����
		printInfo(p);
		p.name="def";
		printInfo(s);
		Student s1=(Student)p;
		
		StudentWorker sw=new StudentWorker("jkl",22);
		printInfo(sw);
		
		Researcher r1=new Researcher("ghi",28);
		printInfo(r1);
	}
}
