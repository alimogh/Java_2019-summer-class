package restaurant;

public class Casher extends Thread{
	Customer ct;
	
	@Override
	public void run() {
		while(true) {
			try {
				synchronized(this) {
					print("�մ� ��ٸ�");
					wait();			//���� ���, �մ��� �ͼ� �����ϸ鼭 Ǯ��
				}
				synchronized(ct) {
					print("�մ��� ��");
					Thread.sleep(500);
					print("���� �Ϸ�");
					ct.notify();	//����ϰ� �ִ� �մ� Ȱ��ȭ
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void print(String str) {
		System.out.print("����: ");
		System.out.println(str);
	}
	
	public void payment(Customer ct) {
		this.ct=ct;
	}
}
