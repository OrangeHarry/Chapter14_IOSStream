package ch14_2_assistant_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class NonBufferVsBufferExample {
	public static void main(String[] args) {
		try {
			String originalFilePath1 = NonBufferVsBufferExample.class.getResource("originalFile1.jpg").getPath();
			String targetFilePath1 = "C:/Temp/targetFile1.jpg";

			FileInputStream fis = new FileInputStream(originalFilePath1);
			FileOutputStream fos = new FileOutputStream(targetFilePath1); //여기까지가 기본 스트임
			
			String originalFilePath2 = NonBufferVsBufferExample.class.getResource("originalFilePath2.jpg").getPath();
			String targetFilePath2 = "C:/Temp/targetFile2.jpg";

			FileInputStream fis2 = new FileInputStream(originalFilePath2);
			FileOutputStream fos2 = new FileOutputStream(targetFilePath2);   

			BufferedInputStream bis = new BufferedInputStream(fis2);
			BufferedOutputStream bos = new BufferedOutputStream(fos2);  //버퍼스트림 추가(성능 좋게 해주는거)
			long nonBufferTime = copy(fis, fos);
			System.out.println("버퍼를 사용하지 않았을 때 :\t" + nonBufferTime + "ns");

			long bufferTime = copy(bis, bos);
			System.out.println("버퍼를 사용했을 때 :\t" + bufferTime + "ns");

			fis.close();
			fos.close();
			bis.close();
			bos.close();
		} catch (IOException e) {
		} catch (Exception e) {
		}

	}

	static int data = -1;

	public static long copy(InputStream is, OutputStream os) {
		long start = System.nanoTime();
			try {
				while (true) {
				data = is.read();
				if (data == -1) break;
	
				os.write(data);
				os.flush();
				}
			} catch (IOException e) {
		}
		long end = System.nanoTime();
		return (end - start);
	}
}
