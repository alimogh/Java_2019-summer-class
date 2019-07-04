package ch03;

import java.util.Scanner;

/*
 * �������� N���� �����ϴ� ��Ÿ ��ʸ�Ʈ�� �����ߴ�. ��ʸ�Ʈ�� ������ ���� ����ȴ�. 
 * �ϴ� N���� �����ڴ� ��ȣ�� 1������ N������ �����޴´�. 
 * �׷��� �� �Ŀ� ���� ������ ��ȣ���� ��Ÿ�� �Ѵ�. �̱� ����� ���� ���忡 �����ϰ�, 
 * �� ����� �� ���忡�� ��������. ���� �� ������ �����ڰ� Ȧ�����̶��, 
 * ������ ��ȣ�� ���� �����ڴ� ���� ����� �ڵ� �����Ѵ�. 
 * ���� ���忡�� �ٽ� �������� ��ȣ�� 1������ �ű��. 
 * �̶�, ��ȣ�� �ű�� ������ ó�� ��ȣ�� ������ �����ϸ鼭 1������ �ű��. 
 * �� ���� 1���� 2���� ��Ÿ�� �ؼ� 1���� �����ϰ�, 3���� 4���� ��Ÿ�� �ؼ� 4���� �����ߴٸ�, 
 * 4���� ���� ���忡�� ��ȣ 2���� �����޴´�. 
 * ��ȣ�� �ٽ� �������� �Ŀ� �� �� ���� ������ ���带 ��� �Ѵ�.
 * 
 * ��ħ �� ��Ÿ ��ȸ�� ���Ѽ��� �����ߴ�. �������� ���ڱ� ��Ÿ ��ȸ���� ����ϴ� ����� ��������, 
 * �� ���忡�� ���Ѽ��� ����ϴ��� �ñ�������. 
 * �ϴ� �����ΰ� ���Ѽ��� ���� ����ϱ� ������ �׻� �̱�ٰ� �����Ѵ�. 
 * 1 ���忡�� �������� ��ȣ�� ���Ѽ��� ��ȣ�� �־��� ��, 
 * ���� �����ΰ� ���Ѽ��� �� ���忡�� ����ϴ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class File0_Problem_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pirintTutorial(n);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		a--;b--;
		int m = 0;
		while(a!=b) {
			m++;
			a /= 2; b /= 2;
		}
		System.out.println(m);
		
		sc.close();
	}

	//���� �ο��� N���� �� ����ǥ�� ����ϱ� ���� �޼ҵ�
	
	static void pirintTutorial(int N) {

		int r = 0;

		int n = N; 

		int roundNum[] = new int[20];//�ִ� 9������ ���� round[0] ��� X



		for(int i=1,m=n;i<20;i++) {

			roundNum[i] = m;

			m=(m+1)/2;

			r++;



			if(roundNum[i]==roundNum[i-1]) break;

		}



		System.out.println(r);

		r--;

		int bit = (1<<(r))-1;



		for(int i=0;i<r;i++) {

			System.out.print("round " + (r-i) + " : ");



			for(int space = bit>>(i); space>0;space--) {

				System.out.print(" ");

			}

			for(int j=0;j<roundNum[r-i];j++) {

				System.out.printf("%02d",j+1);

				for(int space = bit>>i;space>0;space--)

					System.out.print("  ");

			}

			System.out.println();

		}
	}
}
