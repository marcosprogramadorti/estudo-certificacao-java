package revisao.sim.q75;

class A{
	public int i = 10;
	private int j = 20;
	
}
class B extends A {
	private int i = 30;
	public int k = 40;
}

class C extends B{
	
}
public class TestClass {
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.k);
		
	}
}
