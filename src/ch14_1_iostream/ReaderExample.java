package ch14_1_iostream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {
	public static void main(String[] args) throws IOException {
		String path = "C:/Temp/test7.txt";

		Reader reader = new FileReader(path);

		while (true) {
			int data = reader.read(); // 한문자씩 읽기
			if (data == -1)
				break;
			System.out.println((char) data);// 그냥 읽으면 숫자가 찍히니 문자값으로 디코딩
		}
		reader.close();
	}
}
