package cap06.autoavaliacao;

public class Questao13 {
	public static void main(String[] args) {
		try {
			new Questao13().go();
		} catch (Exception e) {
			System.out.println("Capturou e saiu com erro");
		}
		
	}
	
	void go() {
		go();
	}
}
