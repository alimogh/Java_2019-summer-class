package ch04;
/*
 * 	������
 * 		��ü �ʱ�ȭ ���ִ� ����
 * 		��ü�� ������ �� �� �ѹ��� ȣ���� �Ǿ���
 * 		new ������();
 * 
 * 		Ŭ������ �����ڰ� ������ �����Ϸ� �⺻�����ڸ� ����
 * 		�̸��� �ݵ�� Ŭ���� �̸��� ����
 * 		����Ÿ���� ����
 * 		�����ڸ� ���� �� ���� �� �ִ�
 * 			�ټ��� ������ �ۼ��� ������
 * 				�Ű������� Ÿ��,���ڰ� �޶�� �Ѵ�
 * 		�����ڿ��� �ٸ� ������ ȣ��: this();
 * 			�ݵ�� ù�ٿ� �ۼ��� �Ǿ�� ��
 */
import ch04_class.Animal;

public class f02_class {
	public static void main(String[] args) {
		//�ڵ� import: ctrl+shift+o
		String kind="�����";
		String name="����";
		Animal a=new Animal(kind,name);
		Animal cat=new Animal("������","ȣ��");
		Animal dog=new Animal(kind,name,0);
		a.eat(20);
	}
}
