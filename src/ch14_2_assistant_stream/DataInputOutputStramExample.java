package ch14_2_assistant_stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//DataInPutSteram은 얘가 알아서 형변환을 해줘서 읽어온다...완전 대단한애야
public class DataInputOutputStramExample {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.db");
			DataOutputStream dos = new DataOutputStream(fos);

			dos.writeUTF("홍길동");
			dos.writeDouble(95.5);
			dos.writeInt(1);

			dos.writeUTF("김자바");
			dos.writeDouble(90.3);
			dos.writeInt(2);

			dos.flush();
			dos.close();

			FileInputStream fis = new FileInputStream("C:/Temp/primitive.db");
			DataInputStream dis = new DataInputStream(fis); 

			for (int i = 0; i < 2; i++) { // 요 읽는게 핵심이지
				String name = dis.readUTF();
				double score = dis.readDouble();
				int order = dis.readInt();
				System.out.println(name + " : " + score + " : " + order);
			}

			dis.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
