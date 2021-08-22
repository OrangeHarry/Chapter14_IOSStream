package ch14_2_assistant_stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//DataInPutSteram은 얘가 알아서 형변환을 해줘서 읽어온다...완전 대단한애야
public class DataInputOutputStramExample {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.db"); //출력스트림
			DataOutputStream dos = new DataOutputStream(fos); // 보조스트림 연결

			dos.writeUTF("홍길동"); //기본타입 값 출력
			dos.writeDouble(95.5);
			dos.writeInt(1);

			dos.writeUTF("하헌민");
			dos.writeDouble(90.3);
			dos.writeInt(2);

			dos.flush();
			dos.close();

			FileInputStream fis = new FileInputStream("C:/Temp/primitive.db"); //입력스트림
			DataInputStream dis = new DataInputStream(fis); //보조스트림

			for (int i = 0; i < 2; i++) { // 요 읽는게 핵심이지(타입 읽는 순서를 출력했을때 순서랑 똑같이 맞추어야 한다.) 
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
