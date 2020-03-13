package revisao.sim.q3;

public class InitTest {
	{
		s1 = sM1("3");
	}
	String s3 = sM1("2");
	
	String s4 = sM1("4");
	
	public InitTest() {
		  s1 = sM1("1");
	}

	static String s1 = sM1("a");
	
	

	static {
		s1 = sM1("b");
	};
	static String s2 = sM1("c");
	

	public static String sM1(String s) {
		System.out.println(s);
		return s;
	};

	public static void main(String[] args) {
		new InitTest();
	}
}
