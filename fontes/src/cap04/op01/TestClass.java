package cap04.op01;

public class TestClass {
	
	enum Cores {VERMELHO, VERDE, AMARELO};
	
	public static void main(String[] args) {
		
		Cores c1 = Cores.VERMELHO;
		Cores c2 = Cores.VERMELHO;
		if (c1==c2) {
			System.out.println("iqual");
		}else {
			System.out.println("diferente");
		}
		if (c1.equals(c2)) {
			System.out.println("iqual");
		}else {
			System.out.println("diferente");
		}
		
	}
	
}
