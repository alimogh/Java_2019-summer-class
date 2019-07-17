package ch04;

import ch04_class.StaticClass;
/*
 * 	static
 * 		�����ñ�: ���α׷� ������ Ŭ������ ���� �� �޸𸮿� �������
 * 		c.f. non-static���: ��ü ������ �� �޸𸮿� �������
 * 		�޸𸮿� ��ü ������ ������� �����
 * 		��ü ���̵� ���� ����. Ŭ������.static���
 * 
 * 	�ʵ�: ��ü��, �Ǵ� ��ü�� Ŭ�������� ���� �ʵ�
 * 	�޼ҵ�: ��ü�� �������� �ʾƵ� �����Ҽ� �ִ� ���
 * 
 * 	���ǻ���
 * 		static �޼ҵ�: ���α׷� ����� �������
 * 		static �޼ҵ�ȿ� non-static ��� ����� �� ���� �߻� ����(���� �ð��� �ٸ��� ������ �����߻�)
 * 		static �޼ҵ� �ȿ��� static���, ���������� ��� ����
 */
public class f08_Static {
	public static void main(String[] args) {
		StaticClass sc=new StaticClass();
		System.out.println("count: "+sc.count);
		System.out.println("num: "+sc.num);
		StaticClass sc2=new StaticClass();
		System.out.println("count: "+sc2.count);
		System.out.println("num: "+sc2.num);
		StaticClass sc3=new StaticClass();
		System.out.println("count: "+sc3.count);
		System.out.println("num: "+sc3.num);
		
		System.out.println("StaticClass.count: "+StaticClass.count);
	}
}
