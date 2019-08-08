package ch13;

class PrintChar extends Thread{
	char ch;
	PrintChar(char ch){
		this.ch=ch;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.print(ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class F00_Problem01 {
	public static void main(String[] args) throws InterruptedException {
		PrintChar c1=new PrintChar('*');
		PrintChar c2=new PrintChar('-');
		c1.start();
		c2.start();
		
		//join: �ش� �����尡 ���� ������ ��ٸ��� �޼ҵ�
		c1.join();
		c2.join();
		System.out.println("���α׷� ����");
	}
}
