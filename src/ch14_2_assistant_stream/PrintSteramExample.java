package ch14_2_assistant_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintSteramExample {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("C:/Temp/printstream.txt");
			PrintStream ps = new PrintStream(fos);

			ps.println("[������ ���� ��Ʈ��]");
			ps.print("��ġ");
			ps.print("�����Ͱ� ����ϴ� ��ó��");
			ps.print("�����͸� ����մϴ�.");
			ps.flush();
			ps.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
