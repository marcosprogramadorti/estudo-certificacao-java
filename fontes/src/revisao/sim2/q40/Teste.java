package revisao.sim2.q40;

public class Teste {
	public static void main(String[] args) {
		Integer i = new Integer(42); 
		Long ln = new Long(42); 
		Double d = new Double(42.0);
		Long l = Long.parseLong("42");
		//System.out.println(i == ln); // Incompatible operand types Integer and Long
		//System.out.println(ln == d); //Incompatible operand types Long and Double
		//System.out.println( i.equals(d)) ;
		//System.out.println(d.equals(ln));
		System.out.println(ln.equals(42));
		System.out.println(l.equals(42));
		
		
		
		
		
	}
}
