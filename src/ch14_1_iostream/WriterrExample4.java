package ch14_1_iostream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterrExample4 {
	public static void main(String[] args) throws IOException {

		String path = "c:/Temp/test10.txt"; // 문자라서 파일 이름을 txt로 설정

		String str = "KOREA";

		Writer writer = new FileWriter(path);

		writer.write(str); // 배열의 1번인덱스 부터 3번 인덱스까지

		writer.flush();
		writer.close();

	}
}
