package cap06.loops;

public class BreakContinue {

	public static void main(String[] args) {
		
		//exemploContinue();
		//exemploBreakDoisLoop();
		//exemploBreakDoisLoop2();
		//exemploBreakRotulado();
		//System.out.println(" ************************** " );
		//exemploContinueRotulado();
		//exemploBreakRotulado2();
		System.out.println(" ************************** " );
		exemploBreakRotulado3();

		
	}
	
	private static void exemploBreakRotulado3() {
		boolean isTrue = true;
		//saiDeTudo:	
		for (int x = 0; x <= 10; x++) {
			System.out.println("f " + x);
			saiDeTudo:
			while( isTrue ) {
				System.out.println("Hello");
				break saiDeTudo;
			}
			System.out.println("Depois do While");
		}
	
		System.out.println("Depois do for");
	}
	
	private static void exemploBreakRotulado2() {
		boolean isTrue = true;
		saiDeTudo:	
		for (int x = 0; x <= 10; x++) {
			System.out.println("f " + x);
			while( isTrue ) {
				System.out.println("Hello");
				break saiDeTudo;
			}
			System.out.println("Depois do While");
		}
	
		System.out.println("Depois do for");
	}
	
	
	private static void exemploContinueRotulado() {
		saiDetudo:
		for (int x = 0; x <= 10; x++) {
			System.out.println("f " + x);
			int j = x;
			while(j < 5 ) {
				System.out.println("\t w " + x + " w j = " + j);
				j++;
				if (j == 3 ) {
					continue saiDetudo;
				}
			}
			System.out.println("Depois do While");
		}
	
		System.out.println("Depois do for");
	}
	
	private static void exemploBreakRotulado() {
		saiDetudo:
		for (int x = 0; x <= 10; x++) {
			System.out.println("f " + x);
			int j = x;
			while(j < 5 ) {
				System.out.println("\t w " + x + " w j = " + j);
				j++;
				if (j == 3 ) {
					break saiDetudo;
				}
			}
			System.out.println("Depois do While");
		}
	
		System.out.println("Depois do for");
	}

	/**
	 * 
	 */
	private static void exemploContinue() {
		for (int x = 0; x <= 3; x++) {
			if (x == 1 )continue;
			System.out.println("teste do continue " + x);
			
		}
	}
	
	private static void exemploBreakDoisLoop() {
		for (int x = 0; x <= 10; x++) {
			System.out.println("f " + x);
			int j = x;
			while(j < 5 ) {
				System.out.println("\t w " + x + " w j = " + j);
				j++;
				if (j == 3 ) {
					continue;
				}
			}
			
		}
	}
	
	private static void exemploBreakDoisLoop2() {
		for (int x = 0; x <= 10; x++) {
			System.out.println("f " + x);
			int j = x;
			while(j < 5 ) {
				System.out.println("\t w " + x + " w j = " + j);
				j++;
				if (j == 3 ) {
					break;
				}
			}
			
		}
	}

}
