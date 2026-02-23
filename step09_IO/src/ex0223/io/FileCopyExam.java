package ex0223.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JOptionPane;

public class FileCopyExam {
	
	
	public FileCopyExam(String readFile, String writeFile) {
		long start = System.nanoTime();
		//readfile에 있는 내용을 읽어서 writeFile에 저장한다. (Bufferred 사용)
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("src/ex0223/io/test/" + readFile)));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("src/ex0223/io/test/" + writeFile)));)
		{
			
			
			byte b[] = new byte[100];			
			int re = 0;
			while((re = bis.read(b)) != -1) {
				bos.write(b);
				System.out.println(b);
			}
			bos.flush(); // 버퍼를 비워라
			System.out.println("파일 복사 완료");
			
		} catch (Exception e) {
			System.out.println("");
		}
		long end = System.nanoTime();
		System.out.println(end - start);
	}
	public static void main(String[] args) {
		String readFile = JOptionPane.showInputDialog("읽을 파일 명?");
		String writeFile = JOptionPane.showInputDialog("저장할 파일 명?");
		new FileCopyExam(readFile, writeFile);
	}
}