package standard.teste2.q21;


class E1 extends Exception{
	
}
class E2 extends E1{
	
}
class E3 extends E2{
	
}

class A {
	
	long go(String s)throws E3 {
		return 0;
	}
	Object m1() {
		return "legal";
	} 
	
}
class B extends A {
	@Override
	String m1() {
		return "Legal 2";
	}
	@Override
	long go(String s) throws E3
	{
		return 1;
	}
}
public class TestClass {
	
	

}
