package ch14_2_assistant_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

//문자변환 보조 스트림
public class CharacterConvertStreamExample {
	public static void main(String[] args) throws Exception {
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
	}

	public static void write(String str) throws Exception {
//		FileOutputStream스트림에 FileOutPutStreamWriter보조스트립을 연결
		FileOutputStream fos = new FileOutputStream("C:/Temp/test1.txt");
		Writer writer = new OutputStreamWriter(fos);
//		OutputStreamWriter 보조 스트림을 이용해서 문자출력
		writer.write(str);
		writer.flush();
		writer.close();
	}

	public static String read() throws Exception {
//		FileInputStream스트림에 FileInPutStreamReader보조스트립을 연결
		FileInputStream fis = new FileInputStream("C:/Temp/test1.txt");
		Reader reader = new InputStreamReader(fis);
		
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer); //InputStreamWriter 보조 스트림을 이용해서 문자출력
		reader.close();          
		String data = new String(buffer, 0, readCharNum);//char배열에서 읽은 수만큼 문자열로 변환
		return data;
	}
}
//read 다 읽었으면 읽은 바이트 수를 리턴해주고 
      //다 읽은 후에 더이상 읽은게 없으면 -1을 리턴해준다