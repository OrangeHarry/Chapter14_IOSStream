package ch14_2_assistant_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoardUtil {

	List<Board> list;

	public BoardUtil() {
		list = new ArrayList<>();

		list.add(new Board(1, "제목1", "내용1", "글쓴이1", new Date()));
		list.add(new Board(2, "제목2", "내용2", "글쓴이2", new Date()));
		list.add(new Board(3, "제목3", "내용3", "글쓴이3", new Date()));
		list.add(new Board(4, "제목4", "내용4", "글쓴이4", new Date()));
		list.add(new Board(5, "제목5", "내용5", "글쓴이5", new Date()));
	}

	//Board 클래스의 직렬화
	public void write() {
		String path = "C:/Temp/boardClass.db";
		try {
			FileOutputStream fos = new FileOutputStream(path); //파일을 만들어
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(list); //내용에 list를 저장해

			oos.flush();
			oos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//Board 클래스의 역직렬화
	public List<Board> read(){
		String path = "C:/Temp/boardClass.db";
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis); //읽어와야지
			
			List<Board> list = (List<Board>) ois.readObject();
			ois.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
