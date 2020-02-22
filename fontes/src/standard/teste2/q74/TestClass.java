package standard.teste2.q74;

import java.time.LocalDateTime;

public class TestClass {
	public static void main(String[] args) {
		
		LocalDateTime dt = LocalDateTime.parse("2015-01-02T17:13:50");
		System.out.println(dt.format(java.time.format.DateTimeFormatter.ISO_WEEK_DATE));
		System.out.println(dt.format(java.time.format.DateTimeFormatter.ISO_DATE_TIME));
		System.out.println(dt.toString()); 
		
		
	}
}
