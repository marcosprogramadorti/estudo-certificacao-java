package revisao.sim2.q18;

public class Teste {
	void m(Integer x) {
		System.out.println("Integer x");
	}
	void m(Object x) {
		System.out.println("Object x");
	}
	void m(Long x) {
		System.out.println("Long x");
	}
	
	public static void main(String[] args) {
		Long b = Long.valueOf(10);
		new Teste().m(b);
	}
}
