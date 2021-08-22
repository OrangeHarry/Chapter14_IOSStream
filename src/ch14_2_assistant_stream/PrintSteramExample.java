package ch14_2_assistant_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintSteramExample {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("C:/Temp/printstream.txt");
			PrintStream ps = new PrintStream(fos);

			ps.println("[프린터 보조 스트림]");
			ps.print("마치");
			ps.print("프린터가 출력하는 것처럼");
			ps.print("데이터를 출력합니다.");
			ps.flush();
			ps.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
