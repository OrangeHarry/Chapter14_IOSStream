package ch14_1_iostream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterrExample {
	public static void main(String[] args) throws IOException {
		String path = "c:/Temp/test7.txt"; // 문자라서 파일 이름을 txt로 설정

		char a = 'A';
		char b = 'B';
		char c = 'C';

		Writer writer = new FileWriter(path);

		writer.write(a);
		writer.write(b);
		writer.write(c);

		writer.flush();
		writer.close();

	}
}
