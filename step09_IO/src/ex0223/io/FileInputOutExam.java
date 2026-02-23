package ex0223.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutExam {
	public FileInputOutExam() {
		FileInputStream fileInput = null;
		FileOutputStream fileOutput = null;
		try {
			fileInput = new FileInputStream("src/ex0223/io/test/a.txt");
			int len = fileInput.available();
			byte b [] = new byte [100];
			
			
			int re = 0;
			while ( (re = fileInput.read(b)) != -1) {
				System.out.println("re = " + re);

				
				
			}
			String string = new String(b);		
			System.out.println(string);
			
			//파일에 저장 = 출력
			fileOutput = new FileOutputStream("src/ex0223/io/test/write.txt"); // 없으면 만들고 있으면 덮어쓰기			
			String inputString = "배고프다 뭐먹지?";
			fileOutput.write(inputString.getBytes());
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
				try {
					if (fileInput != null) {
					fileInput.close();
					fileOutput.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();				
			}
		}
	}
	
	public static void main(String[] args) {
		new FileInputOutExam();
	}
}
