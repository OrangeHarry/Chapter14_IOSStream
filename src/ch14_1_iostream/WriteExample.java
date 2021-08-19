package ch14_1_iostream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) throws IOException {
		String path = "C:/Temp/test1.db";
		
		byte a =10;
		byte b =20;
		byte c =30;
		
		OutputStream os = new FileOutputStream(path);

		os.write(a);
		os.write(b); //1byte씩 출력
		os.write(c);
		
		os.flush(); //출력 버퍼에 잔류하는 모든 바이트를 출력 //사실 요즘은 close()만 해줘도 된다
		os.close(); //출력 스트립을 닫음
	}
}
