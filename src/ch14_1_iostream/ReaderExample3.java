package ch14_1_iostream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample3 {
	public static void main(String[] args) throws IOException {
		String path = "C:/Temp/test8.txt";
		
		char[] buffer = new char[100];

		Reader reader = new FileReader(path);

		while (true) {
			int readCharNum = reader.read(buffer); 
			if (readCharNum == -1)
				break;
			for(int i=0; i<readCharNum; i++) {
				System.out.println(buffer[i]);// 그냥 읽으면 숫자가 찍히니 문자값으로 디코딩
			}
		}
		reader.close();
	}
}
