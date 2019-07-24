package ch06;

import java.util.Objects;

class Pos{
	int x;
	int y;
	Pos(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o.getClass()!=this.getClass())
			return false;
		Pos p=(Pos)o;
		if(this.x==p.x&&this.y==p.y)
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		return "("+x+", "+y+")";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.x,this.y);
	}
}

public class F01_Object {
	/*
	 * Object
	 * equals	: ���� ��ü���� ��ü�� �ؽð����� ��
	 * hashCode	: ��ü���ؽ����·� ǥ��
	 * toString	: Ŭ������ ������ ��ü�� �ؽð��� ���
	 * 
	 * �������̵��ؼ� ����
	 * equals	: ��ü������ ���� ���� ������ ���� �� ���
	 * hashCode	: ��ü�� �ʵ带 �ؽð����� ��ȯ�Ͽ� ��ȯ
	 * 			: �ߺ� �˻��ϴ� �� ����
	 */
	public static void main(String[] args) {
		Pos p1=new Pos(1,2);
		Pos p2=new Pos(1,2);
		
		String str1=new String("Hello");
		String str2=new String("Hello");
		//String
		
		if(str1.equals(str2)){
			System.out.println("���� ���̴�");
		}
		else {
			System.out.println("�ٸ� ���̴�");
		}
		
		if(p1.equals(p2)){
			System.out.println("���� ���̴�");
		}
		else {
			System.out.println("�ٸ� ���̴�");
		}
		
		if(p1.hashCode() == p2.hashCode()) {
			System.out.println("���� ���̴�.");
		}else {
			System.out.println("�ٸ� ���̴�.");
		}
	}
}
