package standard.teste2.q55;

class A {
	int i;

	public A(int x) {
		this.i = x;
	}
}

class B extends A {
	int j;

	public B(int x, int y) {
		super(x);
		this.j = y;
	}
	
	B(int z ) { this(z, z); }
}

public class TestClass {
	public static void main(String[] args) {
		B a = new B(1,2);
	}
}
