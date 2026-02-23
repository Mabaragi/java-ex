package ex0223.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputBufferedExam {
	public FileInputOutputBufferedExam() {
		FileInputStream fileInput = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fileInput = new FileInputStream("src/ex0223/io/test/a.txt");
			bis = new BufferedInputStream(fileInput);
			
			int len = bis.available();
			byte b [] = new byte [100];						
			int re = 0;
			while ( (re = bis.read(b)) != -1) {
				System.out.println("re = " + re);
//				System.out.println("b= " + b);
				// byte 배열을 String으로 변환
				
				
			}
			String string = new String(b);		
			System.out.println(string);
			
			//파일에 저장 = 출력
			fos = new FileOutputStream("src/ex0223/io/test/write.txt"); // 없으면 만들고 있으면 덮어쓰기
			bos = new BufferedOutputStream(fos);			
			String inputString = "배고프다 뭐먹지?";
			bos.write(inputString.getBytes());
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bis != null) {
				fileInput.close();
				bos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();				
			}
		}
	}
	
	public static void main(String[] args) {
		new FileInputOutputBufferedExam();
	}
}
