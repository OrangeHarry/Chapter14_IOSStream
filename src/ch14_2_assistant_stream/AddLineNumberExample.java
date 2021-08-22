package ch14_2_assistant_stream;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
	public static void main(String[] args) {
		String filePath = "src/ch14_2_assistant_stream/AddLineNumberExample.java";
		
		try {
			FileReader fir = new FileReader(filePath);
			BufferedReader bfr = new BufferedReader(fir);
			
			int rowNum = 0;
			String rowData;
			while((rowData = bfr.readLine()) != null) {
				System.out.println(++rowNum + " : " + rowData);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
