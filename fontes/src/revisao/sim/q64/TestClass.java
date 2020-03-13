package revisao.sim.q64;

interface Teste {
	default void computadorAvancado() {
		System.out.println("teste legal");
	};

	static void computador() {
		System.out.println("teste");
	};

	default void computadorBasico() {
		System.out.println("lega legal 2");
	}

}

public class TestClass implements Teste {
	public static void main(String[] args) {
		Teste.computador();
		TestClass t = new TestClass();
		t.computadorAvancado();
		t.computadorBasico();
	}
}
