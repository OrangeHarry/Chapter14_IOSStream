package ch14_2_assistant_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

//���ں�ȯ ���� ��Ʈ��
public class CharacterConvertStreamExample {
	public static void main(String[] args) throws Exception {
		write("���� ��ȯ ��Ʈ���� ����մϴ�.");
		String data = read();
		System.out.println(data);
	}

	public static void write(String str) throws Exception {
//		FileOutputStream��Ʈ���� FileOutPutStreamWriter������Ʈ���� ����
		FileOutputStream fos = new FileOutputStream("C:/Temp/test1.txt");
		Writer writer = new OutputStreamWriter(fos);
//		OutputStreamWriter ���� ��Ʈ���� �̿��ؼ� �������
		writer.write(str);
		writer.flush();
		writer.close();
	}

	public static String read() throws Exception {
//		FileInputStream��Ʈ���� FileInPutStreamReader������Ʈ���� ����
		FileInputStream fis = new FileInputStream("C:/Temp/test1.txt");
		Reader reader = new InputStreamReader(fis);
		
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer); //InputStreamWriter ���� ��Ʈ���� �̿��ؼ� �������
		reader.close();          
		String data = new String(buffer, 0, readCharNum);//char�迭���� ���� ����ŭ ���ڿ��� ��ȯ
		return data;
	}
}
//read �� �о����� ���� ����Ʈ ���� �������ְ� 
      //�� ���� �Ŀ� ���̻� ������ ������ -1�� �������ش�