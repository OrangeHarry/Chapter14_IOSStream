package ch14_1_iostream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterrExample2 {
	public static void main(String[] args) throws IOException {
		
		String path = "c:/Temp/test8.txt"; // ���ڶ� ���� �̸��� txt�� ����

		char[] array = { 'A', 'B', 'C', 'D', 'E' };

		Writer writer = new FileWriter(path);

		writer.write(array);

		writer.flush();
		writer.close();

	}
}
