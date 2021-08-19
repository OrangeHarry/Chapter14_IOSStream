package ch14_1_iostream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample2 {
	public static void main(String[] args) throws IOException {
		String path = "C:/Temp/test9.txt";

		char[] buffer = new char[5];

		Reader reader = new FileReader(path);

		int readCharNum = reader.read(buffer, 2, 3);
		if (readCharNum != -1)
			for (int i = 0; i < buffer.length; i++) {
				System.out.println(buffer[i]);// 그냥 읽으면 숫자가 찍히니 문자값으로 디코딩
			}
		reader.close();
	}
}
