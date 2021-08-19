package ch14_1_iostream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterrExample3 {
	public static void main(String[] args) throws IOException {

		String path = "c:/Temp/test9.txt"; // 문자라서 파일 이름을 txt로 설정

		char[] array = { 'A', 'B', 'C', 'D', 'E' };

		Writer writer = new FileWriter(path);

		writer.write(array, 1, 3); //배열의 1번인덱스 부터 3번 인덱스까지

		writer.flush();
		writer.close();

	}
}
