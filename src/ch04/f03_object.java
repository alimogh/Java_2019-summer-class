package ch04;

import ch04_class.Student;

public class f03_object {
	/*
	 * ��ü(object)
	 * 
	 * ��ü = ���۷��� ����, �ּҰ�(�ؽð�)�� �����ϴ� ����
	 * 
	 * ��ü �迭: ��ü���� ��Ƴ��� ����(�迭)->���۷��� ������
	 */
	public static void main(String[] args) {
		Student s1=new Student("ȫ�浿",2);
		Student s2=new Student("Ȧ�浿",2);
		Student s3;
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		
		s3=s1;
		System.out.println("s3="+s3);
		System.out.println("s3 name="+s3.name);
		
		System.out.println("���� ��1:"+s1.grade);
		System.out.println("���� ��3:"+s3.grade);
		s3.grade=3;
		System.out.println("���� ��1:"+s1.grade);
		System.out.println("���� ��3:"+s3.grade);
		
		
		Student students[]=new Student[30];
		for(int i=0;i<30;i++) {
			students[i]=new Student();
		}
	}

}
