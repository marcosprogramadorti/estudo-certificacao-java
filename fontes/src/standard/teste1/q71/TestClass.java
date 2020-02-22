package standard.teste1.q71;

public class TestClass {
	public static void main(String[] args) {
		String s = new String("Teste");
		String s2 = new String("Teste");
		StringBuilder sb = new StringBuilder("Teste");
		System.out.println(s.equals(s));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(sb.equals(s2.toString()));
		System.out.println(s.equals(sb.toString()));
		System.out.println(s.intern().equals(s2));
	}

}
