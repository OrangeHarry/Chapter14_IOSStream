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
		
		os.flush(); //��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ�� ��� //��� ������ close()�� ���൵ �ȴ�
		os.close(); //��� ��Ʈ���� ����
	}
}
