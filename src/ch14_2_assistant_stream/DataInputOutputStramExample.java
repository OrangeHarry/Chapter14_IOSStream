package ch14_2_assistant_stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//DataInPutSteram�� �갡 �˾Ƽ� ����ȯ�� ���༭ �о�´�...���� ����Ѿ־�
public class DataInputOutputStramExample {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.db"); //��½�Ʈ��
			DataOutputStream dos = new DataOutputStream(fos); // ������Ʈ�� ����

			dos.writeUTF("ȫ�浿"); //�⺻Ÿ�� �� ���
			dos.writeDouble(95.5);
			dos.writeInt(1);

			dos.writeUTF("�����");
			dos.writeDouble(90.3);
			dos.writeInt(2);

			dos.flush();
			dos.close();

			FileInputStream fis = new FileInputStream("C:/Temp/primitive.db"); //�Է½�Ʈ��
			DataInputStream dis = new DataInputStream(fis); //������Ʈ��

			for (int i = 0; i < 2; i++) { // �� �д°� �ٽ�����(Ÿ�� �д� ������ ��������� ������ �Ȱ��� ���߾�� �Ѵ�.) 
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
