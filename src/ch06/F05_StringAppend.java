package ch06;

public class F05_StringAppend {
	public static void main(String[] args) {
		/*
		 * ���ڿ� ���ϱ�(�̾��)
		 * 	+ ������
		 * 	concat �޼ҵ�
		 * 	StringBuilder,StringBuffer Ŭ����
		 */
		String s="";
		long start=System.currentTimeMillis();
		for(int i=0;i<200000;i++) {
			s+="a";
		}
		System.out.println(System.currentTimeMillis()-start);
		
		s="";
		start=System.currentTimeMillis();
		for(int i=0;i<200000;i++) {
			s.concat("s");
		}
		System.out.println(System.currentTimeMillis()-start);
		
		StringBuilder sb=new StringBuilder();
		start=System.currentTimeMillis();
		
		for(int i=0;i<200000;i++) {
			sb.append("a");
		}
		System.out.println(System.currentTimeMillis()-start);
	}
}
