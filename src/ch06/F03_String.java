package ch06;

public class F03_String {
	/*
	 * String
	 * 	���ڿ��� �����ϴ� �뵵���� ����� �߾���.
	 * 
	 * str1="Java";
	 * str3=new String("Java");
	 */
	public static void main(String[] args) {
		String str1="Java";
		String str2="Java";
		
		if(str1==str2)
			System.out.println("Same Strings");
		else
			System.out.println("Different Strings");
		
		String str3=new String("Java");
		String str4=new String("Java");
		
		if(str1==str3)
			System.out.println("Same Strings");
		else
			System.out.println("Different Strings");
		
		if(str3==str4)
			System.out.println("Same Strings");
		else
			System.out.println("Different Strings");
	}
}
