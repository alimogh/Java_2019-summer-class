package restaurant;

public class Restaurant {
	public static void main(String[] args) {
		//�մ� ������� ���� ������
		Casher cash=new Casher();
		cash.start();
		Customer cs=new Customer(cash);
		cs.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized(cs) {
			cs.notify();
		}
	}
}
