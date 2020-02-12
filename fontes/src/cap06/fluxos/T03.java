package cap06.fluxos;

import sun.security.provider.JavaKeyStore.CaseExactJKS;

public class T03 {

	public static void main(String[] args) {
		// StringIqual();
		// charAceita();
		// byteAceita();
		// boxChaves();
		//verSeEhPar();
		 //verfallThrough();
		 verfallThrough2();
	}

	private static void verSeEhPar() {
		int x = 3;
		switch (x) {
			case 2:
			case 4:
			case 6:
			case 8:
			case 10: {
				System.out.println(x + " é para");break;
			}
			default:{
				System.out.println(x + " é impar");
			}

		}
	}
	private static void verfallThrough() {
		int x = 2;
		switch (x) {
			case 1: System.out.println("1");
					System.out.println("1-1");
			case 2: System.out.println("2");
					System.out.println("2-1");
					System.out.println("2-2");
			default: 
					System.out.println("default");
			case 3:
					System.out.println("3");
					System.out.println("3-1");
			

		}
	}
	
	private static void verfallThrough2() {
		char x = 2;
		switch (x) {
			case 1: System.out.println("1");
					System.out.println("1-1");
			case 2: System.out.println("2");
					System.out.println("2-1");
					System.out.println("2-2");
			default: 
					System.out.println("default");
			case 3:
					System.out.println("3");
					System.out.println("3-1");
			

		}
	}

	private static void testExpressao() {
		int x = 2;
		switch (x) {

		case (1 + 1):
			System.out.println("x == 1");

		case (2 + 1):
			System.out.println("x == 2");

		case (128 - 5):
			System.out.println("x == 3");

		default:
			System.out.println("x qualquer numero");

		}
	}

	private static void testExpressao2() {
		final String y = "lega";
		final String z;
		z = "3";
		String x = "24454adfa";
		switch (x) {

		case (1 + ""):
			System.out.println("x == 1");

//			case (2+"asdfas" + z):
//				System.out.println("x == 2");

		case ("655" + y):
			System.out.println("x == 3");

		default:
			System.out.println("x qualquer numero");

		}
	}

	private static void byteAceita() {
		byte x = 2;
		switch (x) {

		case '1':
			System.out.println("x == 1");

		case 2:
			System.out.println("x == 2");

		case 127:
			System.out.println("x == 3");

		default:
			System.out.println("x qualquer numero");

		}
	}

	private static void boxAceita() {

		switch (new Integer("4")) {

		case 1:
			System.out.println("x == 1");

		case 2:
			System.out.println("x == 2");

		case 127:
			System.out.println("x == 3");

		default:
			System.out.println("x qualquer numero");

		}
	}

	private static void boxChaves() {

		switch (2) {

		case 1:
			System.out.println("x == 1");

		case 2: {
			System.out.println("boxChaves ");
			System.out.println("boxChaves ");
			System.out.println("boxChaves ");
			System.out.println("boxChaves ");
		}

		case 127:
			System.out.println("x == 3");

		default:
			System.out.println("x qualquer numero");

		}
	}

	private static void charAceita() {
		char x = 2;
		switch (x) {

		case '1':
			System.out.println("x == 1");

		case 2:
			System.out.println("x == 2");

		case 129:
			System.out.println("x == 3");

		default:
			System.out.println("x qualquer numero");

		}
	}

	private static void StringIqual() {
		String x = "Segunda";
		switch (x) {

		case "DOMINGO":
			System.out.println("DOM");
			break;
		case "Segunda":
			System.out.println("Segunda");
			break;
		case "SEGUNDA":
			System.out.println("SEGUNDA");
			break;
		default:
			System.out.println("OUTRO DIA");

		}
	}

}
