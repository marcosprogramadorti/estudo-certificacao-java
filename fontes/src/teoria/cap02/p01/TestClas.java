package teoria.cap02.p01;

interface Falador {
	void falar();
}

class A implements Falador {
	int t = 1;

	@Override
	public void falar() {
		System.out.println("A falar");
	}

}

class B extends A implements Falador {
	int t = 5;

	@Override
	public void falar() {
		System.out.println("B falar");
	}

}

class C extends B {
	int t = 10;

	@Override
	public void falar() {
		System.out.println("C falar");
	}
}

class D extends C {
	int t = 20;

	@Override
	public void falar() {
		System.out.println("D falar");
	}
}

public class TestClas {
	public static void main(String[] args) {
		D d = new D();
		C c = d;
		c.falar();
		System.out.println(c.t);
	}
}
