package cap06.fluxos;

public class T03 {

	

	public static void main(String[] args) {
		
		charAceita();
		byteAceita();
		boxChaves();

	}
	
	private static void testExpressao() {
		int x = 2;
		switch (x) {
			
			case (1+1):
				System.out.println("x == 1");
				
			case (2+1):
				System.out.println("x == 2");
					
			case (128-5):
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
			
			case (1+""):
				System.out.println("x == 1");
				
//			case (2+"asdfas" + z):
//				System.out.println("x == 2");
					
			case ("655" + y ):
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
				
			case 2:
				{
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

}
