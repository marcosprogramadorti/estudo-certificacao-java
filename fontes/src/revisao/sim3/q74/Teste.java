package revisao.sim3.q74;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Teste {
	
	
	public static void main(String[] args) {
		LocalDateTime d = LocalDateTime.parse("2020-03-06T14:13:50");
		LocalDateTime d2= LocalDateTime.now();
		
		System.out.println(d + " - " + d.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println(d2+ " - " + d2.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println(DateTimeFormatter.ISO_ZONED_DATE_TIME);
		
		
	}
	
}
