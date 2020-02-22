package standard.teste1.q21;


class Nivel1{
	
}
class Nivel2 extends Nivel1{
	
}
class Base {
	public Object getValue() {
		return new Object();
	} // 1
	public float m1() {
		return 0;
	}
	public Nivel2 m2() {
		return null;
	}
}

class Base2 extends Base {
	@Override
	public String getValue() {
		return "hello";
	} // 2
	
	@Override
	public float m1() {
		return 1;
	}
	@Override
	public Nivel2 m2() {
		return null;
	}
}

public class TestClass {
	public static void main(String[] args) {
		Base b = new Base2();
		Base b1 = new Base();
		System.out.println(b.getValue()); // 3
		System.out.println(b.m1()); // 3
		System.out.println(b1.m1()); // 3
		
	}
}