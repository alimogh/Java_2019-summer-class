package ch08;
/*
 * ./work/operation.txt �� �о�鿩
 * ����� ������ �� �� ��� ���� ���Ͽ� ����İ� �Բ� �����ϴ�
 * ���α׷��� �ۼ�
 * 
 * operation ������ �� �� �� �о� �鿩�� �迭 �Ǵ� �÷��ǿ� ����
 * ��� ������� ������ �� ������
 * �迭 �Ǵ� �÷��ǿ��� �ϳ��� �����ͼ� ������ ������ ���ֽø� �˴ϴ�.
 *  ������ ������ ������ ���� ���� Integer.parseInt(s) �� ��ȯ
 *  
 * ��� ������ �� �� ������ �ص� �ǰ�(*), �� ������ ������ ���Ͽ� �����ص� �˴ϴ�.
 * 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class F00_Problem04 {
	public static void main(String[] args) {
		File file=new File("./work/operation.txt");
		try {
			BufferedReader br=new BufferedReader(
					new InputStreamReader(
							new FileInputStream(file),"UTF-8"));
			String str;
			ArrayList<String> list=new ArrayList<>();
			while((str=br.readLine())!=null) {
				list.add(str);
			}
			
			BufferedWriter bw=new BufferedWriter(
					new OutputStreamWriter(
							new FileOutputStream(file),"UTF-8"));
			for(int i=0;i<list.size();i++) {
				StringTokenizer st=new StringTokenizer(list.get(i));
				int a=Integer.parseInt(st.nextToken());
				String op=st.nextToken();
				int b=Integer.parseInt(st.nextToken());
				bw.append(a+" "+op+" "+b+" = ");
				System.out.print(a+" "+op+" "+b+" = ");
				switch(op.charAt(0)) {
				case '+':
					bw.append(String.valueOf(a+b));
					System.out.println(a+b);
					break;
				case '-':
					bw.append(String.valueOf(a-b));
					System.out.println(a-b);
					break;
				case '*':
					bw.append(String.valueOf(a*b));
					System.out.println(a*b);
					break;
				case '/':
					bw.append(String.valueOf(a/b));
					System.out.println(a/b);
					break;
				default:
				}
				bw.newLine();
			}
			bw.flush();
			
			br.close();
			bw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
