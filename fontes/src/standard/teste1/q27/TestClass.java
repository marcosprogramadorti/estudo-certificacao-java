package standard.teste1.q27;

public class TestClass {
	public static int getSwitch(String str) {
		System.out.println("valor do paramero " + str);
		System.out.println("valor do sub string " + str.substring(1, str.length() - 1));
		return (int) Math.round(Double.parseDouble(str.substring(1, str.length() - 1)));
	}

	public static void main(String args[]) {
		switch (getSwitch(args[0])) {
		case 0:
			System.out.print("Hello ");
		case 1:	
			System.out.print("World");
			break;
		default:
			System.out.print("Good Bye");
		}
		System.out.println();
		System.out.println("Teste: " + Double.parseDouble(("-0.50")));
		System.out.println("Math.round(-0.40) " + Math.round(-0.40));
		System.out.println("Math.round(0.40) " + Math.round(0.40));
		System.out.println("Teste: " + Math.round(Double.parseDouble(("-0.50"))));
		
	}
}

//	What will be printed by the above code if it is run with command line: java TestClass --0.50 (There are two minuses before 0.)