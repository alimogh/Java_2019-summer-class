package Ch02;

import java.util.Scanner;

public class F03_ifelse_ex {

	public static void main(String[] args) {
		//�����ϴ� 100 �߰��Դϴ� 300 �����ϴ�.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϼ��� �Է��ϼ���: ");
		int day = sc.nextInt();
		if(day <= 100)
			System.out.println("�����ϴ�.");
		else if(day < 300)
			System.out.println("�߰��Դϴ�.");
		else
			System.out.println("�����ϴ�.");
		
		sc.close();
		
	}

}
