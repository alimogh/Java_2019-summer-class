package ch02;

import java.util.Scanner;

public class F05_switch_case {
	/*
	 * 	ifó�� ���ǽĿ����� �������� ���� �ƴ϶�, ������ �Ŀ� ���� ���� ���� ������
	 * 	������ �ƴ� �Ϲ� ������� ����
	 * 	switch(){
	 * 	case ��:
	 * 	
	 * 	case ��:
	 * 	
	 * 	default:	//���� ���� �� ���� �ʴ� ��� ����
	 * 	
	 * 	}
	 * 
	 * 	*����: if else�� �ٸ��� �� �бⰡ ������ �Ѿ�� �ʰ�
	 * 		�� ���� �б⸦ �ٷ� �����Ѵ�
	 * 		break; ������ �����ֱ�
	 * 
	 * 	����, ����, ���ڿ�
	 * 	�Ǽ� �Ұ�(�������� �߻�)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Score: ");
		int score = sc.nextInt();
		switch(score/10) {
		case 10: case 9:
			System.out.println("A");
			break;
		case 8: case 7:
			System.out.println("B");
			break;
		case 6: case 5:
			System.out.println("C");
			break;
		case 4:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		
		sc.close();
	}

}
