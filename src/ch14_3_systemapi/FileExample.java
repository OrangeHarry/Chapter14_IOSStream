package ch14_3_systemapi;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

//FileŬ������ �̿��� ���� �� ���� ���� ���
public class FileExample {
	public static void main(String[] args) {
		//���� ��ü ����
		File dir = new File("C:/Temp/images");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File("C:/Temp/file3.txt");
		
		//���� �Ǵ� ������ �������� ������ ����
		try{
			if(dir.exists() == false) {dir.mkdir();} //�� mkdir�� ���⼭�� ������
		    if(file1.exists() == false) {file1.createNewFile();}
		    if(file2.exists() == false) {file2.createNewFile();}
		    if(file3.exists() == false) {file3.createNewFile();}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// C:/Temp ������ ���� ����� File�迭�� ����
		File temp = new File("C:/Temp");
		File[] contents = temp.listFiles();
		
		System.out.println("�ð�\t\t\t����\t\tũ��\t�̸�");
		System.out.println("-----------------------------------------------------------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for (File file : contents) {
			// ���� �Ǵ� ������ ���
			System.out.println(sdf.format(new Date(file.lastModified())));
			if (file.isDirectory()) {
				System.out.print("\t\t\t<DIR>\t" + file.getName());
			} else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			}
			System.out.println();
		}
	}
}
