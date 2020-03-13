package revisao.sim2.q76;

class A {
	private int i = 10;
	public void f() {
		System.out.println("f");
	}
	public void g() {}
}
class B extends A{
	public int i = 20;
	public void g(){
		
	}
}
public class Teste {
	public static void main(String[] args) {
		A a = new A();
		A b = new B();
		B b2 = new B();
		//System.out.println(b.i); private
		a.f(); // ok
		b.f(); // ok

		System.out.println(b2.i);
	}
}
