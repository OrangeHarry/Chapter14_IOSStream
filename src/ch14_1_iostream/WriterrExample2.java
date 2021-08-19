package ch14_1_iostream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterrExample2 {
	public static void main(String[] args) throws IOException {
		
		String path = "c:/Temp/test8.txt"; // 문자라서 파일 이름을 txt로 설정

		char[] array = { 'A', 'B', 'C', 'D', 'E' };

		Writer writer = new FileWriter(path);

		writer.write(array);

		writer.flush();
		writer.close();

	}
}
