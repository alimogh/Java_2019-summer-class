package ch07;

import java.util.ArrayList;

class MyStack<T>{
	ArrayList<T> list=new ArrayList<>();
	int topIndex=-1;
	//void push()	stack�� �� �߰�
	void push(T t) {
		list.add(t);
		topIndex++;
	}
	//T pop()		stack���� �� ��ȯ&����
	T pop() {
		return list.remove(topIndex--);
	}
	//T top()		���������� ���� �� ��ȯ
	T top() {
		return list.get(topIndex);
	}
	//int getSize()	������ ���� ��ȯ
	int getSize() {
		return topIndex+1;
	}
}

public class F00_Problem05 {
	public static void main(String[] args) {
		MyStack<String> stack1=new MyStack<>();
		
		stack1.push("Hello");
		stack1.push("World!");
		stack1.push("Java");
		stack1.push("Programming");
		
		String str=stack1.pop();
		
		if(str==null) {
			System.out.println("���� �����ϴ�");
		}
		System.out.println(str);
	}
}
