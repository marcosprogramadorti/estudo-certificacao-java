package revisao.sim2.q73;

public class Teste {
	public static void main(String[] args) {
		int a = 5, b = 7, k = 0;
		Integer m = null;
		
		k = new Integer(a) + new Integer(b);
		System.out.println(k);
		
		k = a + new Integer(b);
		System.out.println(k);
		
		k = new Integer(a) + b;
		System.out.println(k);
		
		m = new Integer(a) + new Integer(b);
		System.out.println(m);
		
	}
}
