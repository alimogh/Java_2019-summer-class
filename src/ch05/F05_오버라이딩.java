package ch05;

import ch05_class.Person;
import ch05_class.Researcher;
import ch05_class.Student;
import ch05_class.StudentWorker;

public class F05_�������̵� {
	/*
	 * 	�������̵�: ��ü������ ������ �� �ϳ�	cf)�����ε�
	 * 	����Ŭ�������� ���ǵ� �޼ҵ带 ����Ŭ�������� ������
	 * 
	 * 	����
	 * 		�̸�, �Ű�����(Ÿ��,����), ����Ÿ�� ����
	 * 		���������ڰ� ����Ŭ������ ������ �ͺ��� ������ ������ �ȵ�
	 * 
	 * 	����Ŭ�������� ���ǵ� �޼ҵ�� ������� �ʰ�, ����Ŭ�������� �����ǵ� �޼ҵ尡 ȣ��
	 * 		(���� ���ε�)
	 */
	public static void main(String[] args) {
		Student s1=new Student();
		Researcher r1=new Researcher("abc",40);
		StudentWorker sw1=new StudentWorker("def",27);
		
		s1.sleep();
		r1.sleep();
		sw1.sleep();
		
		Person p1=s1;
		p1.sleep();
		
		p1=r1;
		p1.sleep();
	}
}
