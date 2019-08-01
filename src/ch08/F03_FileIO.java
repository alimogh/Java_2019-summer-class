package ch08;

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
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * ���� ����� (File IO)
 *  ������ ���α׷����� �Ϲ����� ���ҽ� ���� �ϳ��̴�.
 *  ���� ���� �� ����� �� �ܺ� �ý��ۿ����� ���� �ۼ��� �� ���� ���.
 *  
 *  ���� ������� �ϱ� ���ؼ�
 *   - ���� ��� üũ
 *   - ���� �ڵ��� ���
 *   - ��뷮 ������ ����
 *  ���� �Ű��� ���鼭 �ڵ带 ���� '�����ϰ�', '�����ϰ�', 'ȿ��������'
 *  �ۼ��ϱ� ���ؼ� ���� �κ��� �Ű����� �Ѵ�.
 * 
 * File Ŭ������ �ʱ�ȭ�ϱ�
 *  �ڹٿ��� �⺻������ ������ ����ϴ� java.io.File Ŭ������ ���.
 *  File Ŭ������ ����ϸ� ������ ���� Ȯ�� �� ���͸� ���� ����/���͸��� 
 *  ����, ������ �а� ���Ⱑ �����ϴ�.
 *  
 *  File Ŭ������ ����ϱ� ���ؼ��� ������ ��θ� �μ��� �� �����ڸ� ����Ѵ�.
 *   1) ������ ���� ��η� ���� - �����̳� ������ ��ġ�� �ֻ��� ������������ �����ϴ� ǥ���
 *  	File file1 = new File("C:/work/sample1.txt");
 *   2) ������ ��� ��η� ���� - �����̳� ������ ��ġ�� ���� ��ġ�� �������� �����ϴ� ǥ���
 *  	File file2 = new File("./work/sample2.txt");
 *  	"./"	���� ����
 *  	"../"	���� ����
 *   
 *   ��� ������ ���� �� ��
 *    �����쿡�� ������ ��� �����ڴ� '/' �Ӹ� �ƴ϶� '\'�� ����� �Ѵ�.
 *    ���� �����쿡����  
 *    	File file1 = new File("C:\\work\\sample1.txt");
 *    �̷� ������ ���� ��ü�� ������ �� �ִ�.
 *    ������ ������ ���� OS ������ ���� ��� �����ڸ� '/'�� ����ϱ� ������
 *    ������ ������ '/' �� ����� �����Ѵ�.
 *    �Ǵ� File.separator ����� ����Ͽ� ���α׷��� �����ϴ� OS�� ���� �����ڸ�
 *    �� ����� �����ϴ�.
 *     
 *  File Ŭ������ �����ڿ� �μ��� ������ �ƴ� ���͸��� �������� ���
 *  ���͸��� �о�鿩 �� ���͸��� ���ԵǾ��ִ� �����̳� ���͸��� �̸��� �����´�.
 *  
 * �ؽ�Ʈ ���� �о� ���̱�
 *  �ڹ� 6 ������ ���
 *   - FileInpustStream Ŭ����
 *   - InputStreamReader Ŭ����
 *   - BufferedReader Ŭ����
 *   
   		File file = new File("C:/work/sample.txt");
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(file),"UTF-8"));

			for(String line; (line = reader.readLine()) != null;) {
				System.out.println(line);
			}
		} catch(UnsupprotedEncodingException e) {
			System.err.println(e);
		} catch(FileNotFoundExcetpion e) {
			System.err.println(e);
				try {
					Path path = Paths.get("./work");
					Files.createDirectories(path);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
		} catch(IOException e) {
			System.err.println(e);
		} finally {
			if(reader!=null) {
				try {
					reader.close();
				} catch (IOExcetopn e) {
					System.err.println(e);
				}
			}
		}

 * 
 * �ؽ�Ʈ ���� ����
 *  �ڹ� 6 ���� ����
 *   - FileOutputStream
 *   - OutputStreamWriter
 *   - BufferedWriter
        File file = new File("C:/work/sample.txt");
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(file),"UTF-8"));
			writer.append("test");
			writer.newLine();
			writer.append("test2");
		}catch(UnsupportedEncodingException e ) {
			System.err.println(e);
		}catch(FileNotFoundException e) {
			System.err.println(e);
		}catch(IOException e) {
			System.err.println(e);
		}finally {
			if(writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					System.err.println(e);
				}
			}
		}
 * 
 * 
 * Path Ŭ������ �ʱ�ȭ
 *  Path ��
 *  	Java 7 ���Ŀ��� java.nio.file.Path Ŭ������ ����Ͽ� ������ �����ϴ�
 *  	 java.nio.file ��Ű���� �߰��Ǿ���. 
 *  
 * 		 ���� ������ File Ŭ������ ������
 * 		  - ������ ��Ÿ ������(�ۼ���, MIME Ÿ�� ��)�� �ɺ��� ��ũ�� ����� �� ����.
 * 		  - ���͸� ���� ������ ����/����/������ ������ �� ����.
 *  	  �� ���� ������ �ذ��ϱ� ���� Path Ŭ������ Path Ŭ������ ����ϱ� ���� ��ƿ��Ƽ Ŭ����(Paths)
 * 		  �� ���� ������ �ذ��� �Ӹ� �ƴ϶� ���� ��θ� �����ϴ� ���ϰ� ������ �޼��尡 �ټ� �غ�Ǿ� �ִ�.
 *  
 *  	 Path ��ü�� File ��ü�� ��ȣ ��ȯ�� �����ϴ�.
 *    
 * 	 �ֿ� �޼ҵ�
 * 		toString		: ��θ� ���ڿ��� ��ȯ
 * 		toAbsolutePath	: ���� ��θ� ��ȯ
 * 		toFile			: File ��ü ��ȯ
 * 		toUri			: URI ��ȯ
 * 		getParent		: �θ� ��θ� ��ȯ
 * 		normalize		: ����ȭ�� ��θ� ��ȯ
 * 		startsWith		: ������ ��η� �����ϴ����� ���θ� ��ȯ
 * 		endWith			: ������ ��η� ���������� ���θ� ��ȯ
 * 		resolve			: ������ ��θ� ��ȯ
 * 		register		: ���� ���� ���񽺸� ���
 *  
 * Paths �� �̿��� Path Ŭ���� ��ü ����
 * 	1) ������ ���� ��η� ����
 * 		Path path1 = Paths.get("C:/work/sample1.txt");
 * 	2) ������ ��� ��η� ����
 *		Path path2 = Paths.get("./work/sample2.txt");
 *	3) ������ ��θ� ��Ʈ���� ������� ����
 *		Path path3 = Path.get("C:","work","sample3.txt");
 *	4) URI uri = URI.create("file////C:/work/sample4.txt");
 *	   Path path4 = Paths.get(uri);
 *  
 * 
 * �ؽ�Ʈ ���� �о� ���̱�  
 *  �ڹ� 7 ������ ���
 *   - try-with-resource ����
 *   - Path Ŭ����
 *   - BufferedReader
 *   - Files Ŭ������  newBufferedReader �޼ҵ�
 *   - StandaredCharets.UTF_8 ���
 *   
        Path path = Paths.get("C:/work/sample.txt");

		try(BufferedReader reader = 
				Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
			for(String line; (line = reader.readLine()) != null; ) {
				System.out.println(line);
			}
		}catch(IOException e) {
			System.err.println(e);
		}

 *  
 * 
 * �ؽ�Ʈ ���� ���� 
 * 	�ڹ� 7 ���� �ؽ�Ʈ ���� ����
   		Path path = Paths.get("./work/sample.txt");
		
		try(BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8,StandardOpenOption.APPEND)){
			writer.append("test");
			writer.newLine();
			writer.append("test5");
		}catch(IOException e) {
			System.err.println(e);
		}
		
		
 *
 *
 * ���� �����ϱ� 
 *  �ڹ� 7 ���� Files Ŭ������ ���ǵ� �޼ҵ�� ������ ������ ����
 *   ���� : Files.copy(fromFile, toFile);
 *   ���� : Files.delete(path);  // ��ȯ���� ����
 *   	- ������ ������ NoSuchFileException
 *   	- ������ ������ ������ DirectoryNotEmptyException
 *   ���� : Files.deleteIfExists(path); // ������ ������ ��� true, ������ ���� ��� false
 *      - ������ ������ ������ DirectoryNotEmptyException
 *   		�� ���͸��� �����Ϸ��� �ȿ��ִ� ���ϵ� ������ ��.
 *   		�� path.toFile().list() �� ���� ���� ����Ʈ�� ���� �� �� ����.
 *   ���� : Files.createFile(path)
 */
public class F03_FileIO {
	public static void main(String[] args) {
//		File file1=new File("C:/Users/Administrator/Desktop/��ȿ��/aaa.txt");
//		File file2=new File("./aaa.txt");
//		File file3=new File(".");
//		for(String file:file3.list()) {
//			System.out.println(file);
//		}
		File file = new File("./work/sample.txt");
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(file),"UTF-8"));
			
			writer.write("Hello");
			writer.append("test");
			writer.newLine();
			writer.append("test2");
		}catch(UnsupportedEncodingException e ) {
			System.err.println(e);
		}catch(FileNotFoundException e) {
			System.err.println(e);
		}catch(IOException e) {
			System.err.println(e);
		}finally {
			if(writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					System.err.println(e);
				}
			}
		}

	}
}
