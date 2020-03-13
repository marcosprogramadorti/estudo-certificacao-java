package revisao.sim.q40;

class A {
	
}
class AA extends A{
	
}
public class TestClass {
	public static void main(String[] args) {
		A a = new A();
		AA aa = new AA();
		a=aa;
		System.out.println("obj a  = " + a.getClass());
		System.out.println("obj aa = " + aa.getClass());
		
	}
}
