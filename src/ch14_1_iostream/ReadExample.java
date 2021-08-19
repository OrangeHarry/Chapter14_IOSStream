package ch14_1_iostream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws IOException {
		String path = "C:/Temp/test1.db";
		InputStream is = new FileInputStream(path);

		while (true) {
			int data = is.read();// 1byte�� �б�
			if (data == -1)
				break; // ���� ���� �������� ���
			System.out.println(data);
		}
		is.close();
	}
}
