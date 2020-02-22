package standard.teste2.q42;

public class TestClass {
	public static void main(String[] args) throws Exception {
		int a[] = null;
		int i  = a[m1()];
	}

	public static int m1() throws Exception {
		throw new Exception("Some exception");
	}
}
