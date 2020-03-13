package revisao.sim2.q74;

import java.time.LocalDateTime;

public class Teste {
	public static void main(String[] args) {
		LocalDateTime d1 = LocalDateTime.parse("2015-01-02T17:13:50");
		System.out.println(d1.format(java.time.format.DateTimeFormatter.ISO_ORDINAL_DATE)); 
		System.out.println(d1.format(java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		System.out.println(d1);
	}
}
