package cap06.autoavaliacao;

public class Questao008 {
	 
	static int x = 7;
	
	 public static void main(String[] args) {
		String s = "";
		for (int y = 0; y < 3; y++) {
			x++;
			switch (x) {
			case 8: s+="8 ";
			default: s+="d ";
			case 9: s+="9 ";
			case 10: {s+="10 "; break;}
			case 13: s+="13 ";	
			}
			
		}
		System.out.println(s);
	}
	 static {x++;} 
}