package ch02;

import java.util.Scanner;

/*
 * 	��� => ���ǹ�, �ݺ���
 * 	���α׷��� �����ϴ� ��ɾ�
 * 
 * 	����
 * 	if(���ǽ�){
 * 		���� ��ɾ�
 * 	}
 * 	else if(���ǽ�){
 * 	}
 * 	else{
 * 	}
 */

public class f01_If {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int score = 70;
		if(score >= 80) {
			System.out.println("�����մϴ�!");
			System.out.println("�հ��ϼ̽��ϴ�.");
		}
		else {
			System.out.println("���հ��Դϴ�.");
		}
		System.out.println("�����ϼ̽��ϴ�.");
		
		System.out.println();
		
		int x = 20;
		int y = 38;
		if(x > 20 && x < 30) {
			if(y > 20 && y < 40)
				System.out.println("Inside of the range.");
		}
		else {
			System.out.println("Out of the range.");
		}
		
		sc.close();
	}

}
