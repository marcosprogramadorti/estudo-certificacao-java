package standard.teste2.q56;

class A {
	A() {
		print();
	}

	void print() {
		System.out.println("A");
	}
}

public class B extends A {
	int i = 5;
	public static void main(String[] args) {
		A a = new B();
		//System.out.println(i);
	}
}
