package revisao.sim3.q23;

public class Teste {
	public static void main(String[] args) {
		
		System.out.println("true  = " + (Boolean.parseBoolean("true") == true));
		System.out.println("false = " + (Boolean.parseBoolean("TrUe") == new Boolean(null)));
		System.out.println("false ref. objeto:  = " + ( new Boolean("TrUe") == new Boolean(true)));
		System.out.println("true  = " + (new Boolean("no") == false));
		
		System.out.println();
		System.out.println("-----------------------");
		
		System.out.println("true  = " + (Boolean.parseBoolean("true")));
		
		System.out.println("true  = " + (Boolean.parseBoolean("TrUe")));
		System.out.println("false = " + (new Boolean(null)));
		
		System.out.println("true  = " + ( new Boolean("TrUe")));
		System.out.println("true  = " + ( new Boolean(true)));
		
		System.out.println("false  = " + ( new Boolean("no") ));
		
		
		
	}
	
}
