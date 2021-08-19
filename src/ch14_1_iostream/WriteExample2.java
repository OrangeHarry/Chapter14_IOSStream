package ch14_1_iostream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample2 {
	public static void main(String[] args) throws IOException {
		
		byte[] array = {10, 20, 30};
		String path = "C:/Temp/test2.db";
		
		OutputStream os = new FileOutputStream(path);

		os.write(array);
		
		os.flush(); //��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ�� ��� //��� ������ close()�� ���൵ �ȴ�
		os.close(); //��� ��Ʈ���� ����
	}
}
