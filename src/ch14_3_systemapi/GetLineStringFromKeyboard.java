package ch14_3_systemapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class GetLineStringFromKeyboard {
	public static void main(String[] args) {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is); // Inputstream�� Reader�� ��ȯ
		BufferedReader br = new BufferedReader(reader);// BufferedReader�� ����

		try {
			while (true) {
				System.out.print("�Է��ϼ��� : ");
				String lineStr = br.readLine();// ���δ����� ���ڿ��� ����
				if (lineStr.equals("q") || lineStr.equals("quite"))
					break; // q�Ǵ� quite�� �о����� �ݺ��� ����
				System.out.print("�Էµ� ���� : " + lineStr);
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
