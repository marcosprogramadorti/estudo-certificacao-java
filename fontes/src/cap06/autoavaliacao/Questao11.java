package cap06.autoavaliacao;

public class Questao11 {
	
	static String s = "";
	public static void main(String[] args) {
		try {
			s +="1";
			throw new Exception();
		} catch (Exception e) {
			s +="2";
		} finally {
			try {
				s +="3"; doStuff(); s +="4";
			} catch (Exception e2) {
				System.out.println(s);	
			}
			
		}
		System.out.println(s);
	}
	private static void doStuff() {
		int x = 0; int y = 7/x;
		
	}
	
	
}
