package ch07;

import java.util.HashMap;
import java.util.Scanner;

public class F06_HashMap {
	public static void main(String[] args) {
		HashMap<String,String> hash=new HashMap<>();
		//���ѻ���
		//key: ����
		//value: �ѱ���
		hash.put("apple","���");
		hash.put("banana","�ٳ���");
		hash.put("love","���");
		System.out.println(hash);
		
		hash.put("apple","����");
		hash.replace("apple","���");
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			String search=sc.next();
			if(search.equals("exit"))
				break;
			System.out.println(hash.get(search));
		}
		sc.close();
	}
}
