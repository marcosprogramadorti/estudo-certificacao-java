package revisao.sim.q65;

public class TestClass {
	public static void main(String[] args) throws Exception {
		TestClass t = new TestClass();
		t.meuMetodo();
	}

	public void meuMetodo() throws Exception {
		seuMetodo();
	}

	public void seuMetodo() throws Exception {

		throw new Exception();

	}
}
