package ch14_1_iostream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterrExample3 {
	public static void main(String[] args) throws IOException {

		String path = "c:/Temp/test9.txt"; // ���ڶ� ���� �̸��� txt�� ����

		char[] array = { 'A', 'B', 'C', 'D', 'E' };

		Writer writer = new FileWriter(path);

		writer.write(array, 1, 3); //�迭�� 1���ε��� ���� 3�� �ε�������

		writer.flush();
		writer.close();

	}
}
