package restaurant;

public class Customer extends Thread{
	Casher cash;
	public Customer(Casher cash) {
		this.cash=cash;
	}
	@Override
	public void run() {
		try {
			synchronized(this) {
				wait();			//�Ĵ� ���� ���̹Ƿ� ���
				print("����");
				print("����");
			}
			
			//���� �θ� �� ������ �߿�
			//payment ���� �� ���� ������
			synchronized(cash) {
				cash.payment(this);
				cash.notify();	//���� ����
				print("���� ��");
			}
			synchronized(this) {
				wait();
				print("���� �Ϸ�");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void print(String str) {
		System.out.print("�մ�: ");
		System.out.println(str);
	}
}
