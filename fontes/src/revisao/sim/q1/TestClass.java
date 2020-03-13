package revisao.sim.q1;

class MyException extends Exception{
	public MyException(String msg) {
		super(msg);
	}
}
public class TestClass {
	
	public static void main(String[] args) {
		try {
			hello();
			System.out.println("fim");
		} catch (MyException e) {
			//System.out.println(e);
			e.printStackTrace();
		}
	}
	public static void hello() throws MyException {
		int[] dear = new int[7];
		dear[0] = 747;
		foo();
	}

	private static void foo() throws MyException {
		throw new MyException("Exception from foo");
		
	} 
}
