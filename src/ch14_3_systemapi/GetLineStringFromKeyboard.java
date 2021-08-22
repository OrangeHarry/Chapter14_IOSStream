package ch14_3_systemapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class GetLineStringFromKeyboard {
	public static void main(String[] args) {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is); // Inputstream을 Reader로 변환
		BufferedReader br = new BufferedReader(reader);// BufferedReader를 연결

		try {
			while (true) {
				System.out.print("입력하세요 : ");
				String lineStr = br.readLine();// 라인단위로 문자열을 읽음
				if (lineStr.equals("q") || lineStr.equals("quite"))
					break; // q또는 quite를 읽었을때 반복문 종료
				System.out.print("입력된 내용 : " + lineStr);
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
