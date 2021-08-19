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
		os.write(b); //1byte�� ���
		os.write(c);
		
		os.flush(); //��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ�� ��� //��� ������ close()�� ���൵ �ȴ�
		os.close(); //��� ��Ʈ���� ����
	}
}
