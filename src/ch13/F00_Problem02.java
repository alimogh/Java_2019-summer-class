package ch13;

class Pos extends Thread implements Comparable<Pos>{
	int x;
	Pos des;
	Pos(){}
	Pos(int x,Pos des){
		this.x=x;
		this.des=des;
	}
	@Override
	public int compareTo(Pos p) {
		if(this.x<p.x)
			return -1;
		else if(this.x>p.x)
			return 1;
		else
			return 0;
	}
	@Override
	public void run() {
		int s=compareTo(des);
		int time=0;
		while(s==compareTo(des)) {
			this.x-=s;
			time++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.x+" "+des.x);
		}
		System.out.println("��ġ: "+this.x);
	}
}

public class F00_Problem02 {
	/*
	 * 	���򼱿� ������ �� ���� ���� ��
	 * 	�� ���� ���� 1�ʿ� 1�� �������
	 * 	���� �� ��������ġ, ���������� ��ġ ���
	 */
	public static void main(String[] args) {
		Pos p1=new Pos();
		Pos p2=new Pos(4,p1);
		p1=new Pos(0,p2);
		//p1.start();
		p2.start();
	}
}
