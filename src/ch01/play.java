package ch01;

import java.util.Scanner;

public class play {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input a number under 100: ");
		int num = sc.nextInt();
		System.out.println(num/10 + num%10);
		
		System.out.println();
		
		System.out.print("Input seconds: ");
		long sec = sc.nextLong();
		long min, hour, day;
		day = sec / (60 * 60 * 24);
		sec %= (60 * 60* 24);
		hour = sec / (60 * 60);
		sec %= (60 * 60);
		min = sec / 60;
		sec %= 60;
		System.out.println(day + "days " + hour  + "h " + min  + "m " + sec + "s");
		
		System.out.println();
		
		System.out.println("Input price");
		int pay = sc.nextInt();
		System.out.println("5����: " + pay/50000);
		pay %= 50000;
		System.out.println("1����: " + pay/10000);
		pay %= 10000;
		System.out.println("5õ��: " + pay/5000);
		pay %= 5000;
		System.out.println("1õ��: " + pay/1000);
		pay %= 1000;
		System.out.println("5���: " + pay/500);
		pay %= 500;
		System.out.println("1���: " + pay/100);
		pay %= 100;
		System.out.println("5�ʿ�: " + pay/50);
		pay %= 50;
		System.out.println("1�ʿ�: " + pay/10);
		pay %= 10;
		System.out.println("������: " + pay);
		
		sc.close();

	}

}
