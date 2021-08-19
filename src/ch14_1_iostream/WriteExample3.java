package ch14_1_iostream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample3 {
	public static void main(String[] args) throws IOException {
		
		byte[] array = {10, 20, 30, 40, 50};
		String path = "C:/Temp/test3.db";
		
		OutputStream os = new FileOutputStream(path);

		os.write(array);
		
		os.flush(); //출력 버퍼에 잔류하는 모든 바이트를 출력 //사실 요즘은 close()만 해줘도 된다
		os.close(); //출력 스트립을 닫음
	}
}
