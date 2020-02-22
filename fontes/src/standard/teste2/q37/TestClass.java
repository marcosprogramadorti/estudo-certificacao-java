package standard.teste2.q37;

public class TestClass {
	public static void main(String[] args) {
		int expr1 = 3 + 5 * 9 - 7; // 41
		int expr2 = 3 + (5 * 9) - 7; //41
		int expr3 = 3 + 5 * (9 - 7); //13
		int expr4 = (3 + 5) * 9 - 7; // 65
		System.out.println("41 =" + expr1);
		System.out.println("41 =" + expr2);
		System.out.println("13 =" + expr3);
		System.out.println("65 =" + expr4);
	}
}
