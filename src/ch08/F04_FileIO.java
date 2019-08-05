package ch08;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class F04_FileIO {
	/*
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
	public static void main(String[] args) {
		Path path=Paths.get("./work/Info.txt");
		Path temp=Paths.get("./work/temp.txt");
		Path newFile=Paths.get("./work/newFile.txt");
		Path newDir=Paths.get("./homework");
		try {
			Files.copy(path,temp);
			Files.createFile(newFile);
			Files.createDirectory(newDir);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
