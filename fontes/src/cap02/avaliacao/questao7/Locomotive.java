package cap02.avaliacao.questao7;

public class Locomotive {
	public Locomotive() {
		main("hi ");
		String[] ar = {" a "," b"}; 
		main(ar); 
	}
	
	public static void main(String[] args) {
		System.out.println("2");
		new Locomotive();
	}
	public static void main(String args) {
		System.out.println("falso main - Locomotive.main()");
	}

}
