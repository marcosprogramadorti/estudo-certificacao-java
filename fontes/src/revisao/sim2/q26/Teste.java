package revisao.sim2.q26;

public class Teste {
	public static boolean getBoolean() {
		return true;
	}
	public static String getString() {
		return "true";
	}
	
	public static void main(String[] args) {
		
		switch (""){
			case "true": 
				System.out.println("true");
				break;
			default:
				System.out.println("nome");
				break;
		}
	}
}
