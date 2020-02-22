package standard.teste1.q35;



public class TestClass  implements IInit{
	
	public static void main(String[] args) {
		TestClass s = new TestClass();
		int j = s.theValue;
		int l = IInit.theValue;
		int k = theValue;
		System.out.println(j+","+l+","+k );
	}

}
