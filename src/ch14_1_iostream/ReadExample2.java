package ch14_1_iostream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample2 {
	public static void main(String[] args) throws IOException {

		String path = "C:/Temp/test3.db";
		byte[] buffer = new byte[100];

		InputStream is = new FileInputStream(path);

		while (true) {
			int readByteNum = is.read(buffer);// 배열길이만큼 읽기
			if (readByteNum == -1)
				break; // 파일 끝에 도달했을 경우
			for (int i = 0; i < readByteNum; i++) { // 읽은 바이트 수만큼 반복하면서
				System.out.println(buffer[i]); // 배열에 저장된 바이트를 출력
			}
		}
		is.close();
	}
}
