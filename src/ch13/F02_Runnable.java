package ch13;

class PrintString implements Runnable{
	String str;
	PrintString(String str){
		this.str=str;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(str);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class F02_Runnable {
	/*
	 * Runnable �������̽��� ���ѽ����� ����
	 * 	Ŭ������ ������ �ٸ������ �ذ�
	 * 	���� �ٸ� Ŭ������ ��ӹް� �ִٸ�
	 * 	Runnable �������̽��� ��ӹ޾� ����
	 */
	public static void main(String[] args) {
		PrintString s1=new PrintString("Hello");
		PrintString s2=new PrintString("World!");
		// �������̽��� ��ӹ޾Ʊ����� ������� �ٷ� ������ ����
		// Thread Ŭ������ ��ü�� �������̽� ������ ��ü �����ڷ� �ְ�
		// Thread ��ü�� start �޼ҵ� ����
		Thread th1=new Thread(s1);
		Thread th2=new Thread(s2);
		Thread th3=new Thread(new Runnable() {
			@Override
			public void run() {
				int time=0;
				while(time<10) {
					System.out.println("second: "+(time++));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		th1.start();
		th2.start();
		th3.start();
	}
}
