package ch14_1_iostream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {
	public static void main(String[] args) throws IOException {
		String path = "C:/Temp/test7.txt";

		Reader reader = new FileReader(path);

		while (true) {
			int data = reader.read(); // �ѹ��ھ� �б�
			if (data == -1)
				break;
			System.out.println((char) data);// �׳� ������ ���ڰ� ������ ���ڰ����� ���ڵ�
		}
		reader.close();
	}
}
