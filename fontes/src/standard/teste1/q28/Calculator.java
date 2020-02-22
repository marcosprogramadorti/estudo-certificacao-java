package standard.teste1.q28;

abstract public class Calculator {
	abstract void calculate();

	public static void main(String[] args) {
		System.out.println("calculating");
		Calculator x = null;
		x.calculate();
	}
}