package cap03.autoavaliacao.questao1;

public class TesteSobreamento {
	static int size = 7;
	
	static void chanceIt (int size  ) {
		size = size + 200;
		System.out.println(size);
	}
	
	public static void main(String[] args) {
		TesteSobreamento ts = new TesteSobreamento();
		ts.chanceIt(size);
		System.out.println("size == " +  size);
	}
}
