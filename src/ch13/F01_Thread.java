package ch13;

import ThreadClass.InputThread;
import ThreadClass.Timer;

/*
 * Thread
 * 	�ϳ��� �۾� ����
 * 
 * 	ä�� ���α׷�(Ŭ���̾�Ʈ)
 * 	->�Է� ������
 * 	->��� ������
 * 	->������ ��� ������
 */
public class F01_Thread {
	public static void main(String[] args) {
		Timer timer=new Timer(0);
		InputThread iThread=new InputThread(timer);
		timer.start();
		iThread.start();
		
		
	}
}
