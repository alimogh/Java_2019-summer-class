package Ch03;

public class F11_foreach {
	/*
	 * 	�ݺ����� �� ����
	 * 	����Ž���� ����
	 * 	�ε��� ���Ұ�
	 * 
	 * 	for(�ڷ��� �����̸�:�迭){
	 * 
	 * 	}
	 */
	public static void main(String[] args) {
		int intArr[]= {15,7,6,2,4,-5,9,-7,2};
		int sum=0;
		for(int num:intArr) {
			if(num>0) sum+=num;
		}
		System.out.println(sum);
	}

}
