package revisao.sim.q35;



interface IInit {
	final int theVal = 10;
}

public class TestClass implements IInit{
	public static void main(String[] args) {
		TestClass t = new TestClass();
		int a = IInit.theVal;
		System.out.println(a);
		int b= theVal;
		System.out.println(b);
		int c = t.theVal;
		System.out.println(c);
	
	}
}
