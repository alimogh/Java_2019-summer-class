package ch03;

public class f08_reference {
	/*
	 * 	���۷��� ����: �ּ� ���� ����
	 * 		�迭,��ü,�������̽� ��ü
	 */
	public static void main(String[] args) {
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++)
			arr[i]=i;
		int arr2[];
		arr2=arr;
		arr2[5]=100;
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
}