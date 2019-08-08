package ch13;

//���� �����Ϳ� 10�� ���ϴ� ������
class AddClass extends Thread{
	static int num=0;
	String name;
	AddClass(String name){
		this.name=name;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			add(10);
			System.out.println(name+":"+num);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public synchronized void add(int a) {
		num+=a;
	}
}

public class F03_����ȭ {
	/*
	 * ����ȭ
	 * Ű����: synchronized	=> �� �����常 ����� �� ����.
	 * �޼ҵ�: wait, notify	=> wait() : ��ٸ��ٰ� ���� notify�Ǵ� �ƹ��� ������ ��쿣 ����
	 * 						=> notify() : �ڿ��� ������� �ʰڴ�. ������ ���� ���!
	 * Ŭ����: semaphore	=> ���� ����� ���� ������ �� ����.
	 * 
	 * synchronized �� �̿��ѵ���ȭ
	 * synchronized ����̳� �޼ҵ忡 ����ϸ�
	 * �ش� ��Ͽ��� �ϳ��ǽ����常 ���� ���
	 * ����̳����� �ٸ� �����尡 ����
	 * �Ʒ��� �޼ҵ�� �ϳ��� �����常 ����
	 * �����尡 ����� ���ϰ� �޼ҵ尡 �����ϸ�
	 * �ٸ� �����尡 �޼ҵ忡 �����ؼ� ���
	 * 	public synchronized int add(int a){
	 * 		num+=a;
	 * 		System.out.println(name+":"+num);
	 * 	}
	 */
	public static void main(String[] args) {
		AddClass a1=new AddClass("A");
		AddClass a2=new AddClass("B");
		AddClass a3=new AddClass("C");
		a1.start();
		a2.start();
		a3.start();
		try {
			a1.join();
			a2.join();
			a3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("AddClass Num is " + AddClass.num);
	}
}
