package ch03;

public class f07_�迭 {
	/*
	 * 	���� ����
	 * 	�ڷ���arr [];
	 * 	�ڷ���[] arr;
	 * 	arr=new int[10];
	 */
	public static void main(String[] args) {
		int intArr[]=new int[10];
		double doubleArr[]= {1.1,1.5,3.4};
		System.out.println(doubleArr[2]);
		System.out.println(intArr.length);
		int len=intArr.length;
		for(int i=0;i<len;i++) {
			intArr[i]=i+1;
		}
		for(int i=0;i<len;i++) {
			System.out.print(intArr[i]+" ");
		}
	}
}