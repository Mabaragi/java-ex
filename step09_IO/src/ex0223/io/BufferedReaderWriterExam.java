package ex0223.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class BufferedReaderWriterExam {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("src/ex0223/io/test/a.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("src/ex0223/io/test/b.txt"))
				){
//			br.lines().forEach(item->System.out.println(item)
//			);
			String data = null;
			while ((data = br.readLine()) != null) {
				System.out.println(data);
				bw.write(data);
				bw.newLine();
				bw.newLine();
				bw.flush();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
