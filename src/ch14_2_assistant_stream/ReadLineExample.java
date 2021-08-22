package ch14_2_assistant_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ReadLineExample {
	public static void main(String[] args) {
		String path = ReadLineExample.class.getResource("language.txt").getPath();
		try {
			Reader reader = new FileReader(path);
			BufferedReader br = new BufferedReader(reader); //������Ʈ�� ����

			while(true) {
				String data = br.readLine(); //���δ��� ���ڿ��� �а� ����
				if(data == null)break; //���� ���� �������� ���
				System.out.println(data);
			}
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
