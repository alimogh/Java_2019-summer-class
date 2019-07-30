package ch07;

import java.util.Vector;

public class F02_Vector {
	/*
	 * Vector<E>
	 */
	public static void main(String[] args) {
		//Integer Ÿ�� ��ü�� ����Ǵ� �÷���
		Vector<Integer> vector=new Vector<Integer>();
		//������ �߰�
		vector.add(10);
		vector.add(11);
		vector.add(12);
		System.out.println(vector);
		//���ϴ� ��ġ�� ������ �߰�
		vector.add(0, 9);
		System.out.println(vector);
		//ũ�� �� ����� ����
		System.out.println("������ ũ��: "+vector.capacity());
		System.out.println("���� ����� ��: "+vector.size());
		//�÷��� ������ ��ü ã��
		System.out.println(vector.contains(10));
		System.out.println(vector.contains(15));
		//��ü�� �ε���: ��ü�� ������ -1 ��ȯ
		System.out.println(vector.indexOf(10));
		//�÷��ǿ��� ������ ��ȯ
		System.out.println(vector.get(1));
		System.out.println(vector.elementAt(1));
		//��ü ����
		System.out.println(vector.remove(Integer.valueOf(10)));	//bool
		System.out.println(vector.remove(1));	//Object
		System.out.println(vector);
		//�÷����� �迭��: 100�������ʹ� �迭�� �� ����
		Object arr[]=vector.toArray();
		int num=(Integer)arr[0];
		System.out.println(num);
	}
}
