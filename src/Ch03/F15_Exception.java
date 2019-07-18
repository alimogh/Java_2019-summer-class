package Ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class F15_Exception {
	/*
	 * 	���ܹ߻�->���α׷� ����
	 * 	����ó��->���α׷� �������� ������� ����
	 * 
	 * 	1. try-catch-finally(��������)
	 * 		try{
	 * 			���� �߻� ������ �ڵ�
	 * 		}
	 * 		catch(ArrayIndexOutOfBoundsException | InputMismathException e){
	 * 			���� �߻��� ó���� �ڵ�
	 * 			e.traceTrack();
	 * 		}
	 * 		finally{
	 * 			���� ������� �����ϴ� �ڵ�
	 * 			�޼ҵ� ����ó���� �� �ַ� ���
	 * 			e.traceTrack();
	 * 		}
	 * 	2. throw: �����ڰ� ���������� ���ܸ� �߻���Ű�� Ű����
	 * 		throw new InputMismatchException();
	 * 	3. throws: �߻��� ���ܸ� ���� �޼ҵ忡 ����
	 * 	4. try-with-resource
	 */
	
	public static void exception() throws ArithmeticException {
		try{
			System.out.println(5/0);
			return;
			}
		catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		finally {
			System.out.println("ǥ���Է� �Ϸ�");
		}
	}
	
	public static void bufferReader() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		exception();
		while(true) {
			try{
				exception();
				int n=sc.nextInt();
				for(int i=0;i<n;i++)
					System.out.println(n);
				break;
			}
			catch(InputMismatchException e){
				System.out.println("�߸��� �Է� ���Դϴ�.");
				System.out.println("������ �ٽ� �Է��ϼ���.");
				sc.nextLine();
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("�ε��� ������ �Ѿ���ϴ�.");
			}
			catch(ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�.");
			}
			finally {
				//���ܹ߻����ο� ������� ����
				System.out.println("exit");
			}
		}
		System.out.println("����");
		sc.close();
	}

}
