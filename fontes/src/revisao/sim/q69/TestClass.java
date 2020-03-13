package revisao.sim.q69;

interface A{
	static int  getId(){
		return  0;
	}
}
interface AA extends A{
	static int  getId(){
		return  20;
	}
}
public class TestClass implements AA{
	public static void main(String[] args) {
		TestClass t = new TestClass();
		System.out.println(AA.getId()); 
	}

	
}
