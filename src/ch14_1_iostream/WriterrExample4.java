package ch14_1_iostream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterrExample4 {
	public static void main(String[] args) throws IOException {

		String path = "c:/Temp/test10.txt"; // ���ڶ� ���� �̸��� txt�� ����

		String str = "KOREA";

		Writer writer = new FileWriter(path);

		writer.write(str); // �迭�� 1���ε��� ���� 3�� �ε�������

		writer.flush();
		writer.close();

	}
}
