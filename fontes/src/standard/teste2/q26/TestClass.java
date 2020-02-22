package standard.teste2.q26;

public class TestClass {
	public static boolean getBool() {
		return true;
	}

	public static String getString() {
		return "true";
	}

	public static void main(String[] args) {
		switch (getString()) {
		case "true":
			System.out.println("true");
			break;
		default:
			System.out.println("none");
			break;
		}
	}

}
