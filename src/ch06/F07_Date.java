package ch06;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class F07_Date {
	/*
	 * ��¥, �ð� ���� Ŭ����
	 * ������
	 * 	Date Class
	 * 	Calendar Class(�߻�Ŭ����)
	 * �ڹ�8~
	 * 	LocalDate		:�ð�(h,m,s,nanos)
	 * 	LocalTime		:��¥(y,M,d)
	 * 	LocalDateTime	:�ð��� ��¥
	 * 
	 * 	DateFormat
	 * 	SimpleDateFormat
	 * 
	 * Date
	 * 	Date() : ����ð�
	 * 	Date(long date) : 1970 01 01 09:00:00���� �и��� ������ ����
	 */
	public static void main(String[] args) {
//		System.currentTimeMillis();
		Date date=new Date();
		System.out.println(date);
		
		Calendar cal=Calendar.getInstance();
		System.out.println(cal);
		cal.add(Calendar.HOUR, 10);
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		
		//1�ʸ��� �ð� ���
		date=new Date();
		//date.getTime()+10000>System.currentTimeMillis()
		//���� ���ǽ��� ����� ���� �ݺ��� �ȿ� �ִ� Date�� ��ü�� �ٸ� �̸����� �ۼ�
		DateFormat dateFormat=new SimpleDateFormat("yyyy��MM��dd��");
		
		
//		while(date.getTime()+10000>System.currentTimeMillis()) {
//			if(date.getTime()+1000<=System.currentTimeMillis()) {
//				System.out.println(
//						dateFormat.format(date));
//				date.setTime(System.currentTimeMillis());
//			}
//		}
		
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		lt.getHour();
		lt.getMinute();
		lt.getSecond();
		lt.getNano();
		
		lt.plusHours(0);
		lt.plusMinutes(0);
		lt.plusSeconds(0);
		lt.plusNanos(0);
		
		lt.minusHours(0);
		lt.minusMinutes(0);
		lt.minusSeconds(0);
		lt.minusNanos(0);
	}
}
