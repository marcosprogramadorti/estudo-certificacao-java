package standard.teste1.q41;

class  A{
	public void m1() {
		
	}
}
class B1 extends A{
	
}
class B2 extends A{
public void m1() {
		
	}
}
class C1 extends B1 {
	
}
class C2 extends B1{
public void m1() {
		
	}
}

public class TestClass {
	
	public static void main(String[] args) {
		A  a = new A();
		B1 b1 = new B1();
		B2 b2= new B2();
		C1 c1= new C1();
		C2 c2= new C2();
		
		c1.m1();
		c2.m1();
		b1.m1();
		c1.m1();
		
	}

}
