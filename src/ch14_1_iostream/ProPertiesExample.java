package ch14_1_iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Properties;

public class ProPertiesExample {
	public static void main(String[] args) {

		/**
		 * [Properties] 외부 설정파일 읽어오기
		 * 
		 * - '=' 또는 ':'로 연결된 형태 - 주석라인은 첫 번째 문자가 '#'이어야 한다. - 경로 '/'
		 */

		String path = "src/haheonmin.txt"; // 절대경로가 아닌 상대경로를 쓰는거야
		Properties settings = new Properties();

		try {                   //바이트코드로 읽어서 가져오는것(숫자를 가져오는거네)
			settings.load(new FileInputStream(path));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			System.exit(0);
		}
		
		String eName = settings.getProperty("eng_name");
		System.out.println(eName);

		String kName = settings.getProperty("kor_name"); 
		try {
			kName = new String(kName.getBytes("8859_1"), "EUC-KR");
		} catch (UnsupportedEncodingException e) {}

		System.out.println(kName);
		
		
		String[] dataValue = settings.getProperty("data").split(",");
		System.out.println(Arrays.toString(dataValue));
	
		settings.list(System.out);
	}

}
