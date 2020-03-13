package revisao.sim3.q76;

class A{
	private int i = 10;
	public void f() {
		System.out.println("A.f()");
	}
	public void g() {
		
	}
	
}
class B extends A{
	public int i = 20;
	@Override
	public void g() {
		System.out.println("B.g()");
	}
}

public class Teste {
	public static void main(String[] args) {
		A a = new A();
		A b = new B();
		//System.out.println(b.i); /erro de copilacao
		b.f();
		b.g();
		
	}
}
