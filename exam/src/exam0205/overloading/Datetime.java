package exam0205.overloading;
import java.time.LocalDateTime;

public class Datetime {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		String messege = String.format("%tY년, %td일", now, now);
		System.out.println(messege);
		
	}
}
