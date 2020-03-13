package revisao.sim2.q65;

public class Teste {
	public static void main(String[] args) {
		int i = 10;
		long l = 10;
		char c = 10;
		byte b = 10;
		short s = 10;
		float f = 10;
		//long, float, double, and boolean can never be used as a switch variable.
		
		switch (i){
			case 32: System.out.println(32); break;
			case 64: System.out.println(64); break;
			case 28: System.out.println(128); break;
			default: System.out.println("default");
		}
	}
}
