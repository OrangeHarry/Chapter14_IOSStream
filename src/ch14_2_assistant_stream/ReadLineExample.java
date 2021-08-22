package ch14_2_assistant_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ReadLineExample {
	public static void main(String[] args) {
		String path = ReadLineExample.class.getResource("language.txt").getPath();
		try {
			Reader reader = new FileReader(path);
			BufferedReader br = new BufferedReader(reader); //보조스트림 연결

			while(true) {
				String data = br.readLine(); //라인단위 문자열을 읽고 리턴
				if(data == null)break; //파일 끝에 도달했을 경우
				System.out.println(data);
			}
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
