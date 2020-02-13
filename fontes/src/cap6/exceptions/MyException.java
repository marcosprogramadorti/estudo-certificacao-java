package cap6.exceptions;

public class MyException extends Exception {
	
	public static void main(String[] args) throws MyException {
		someMethod();
	}
	static void someMethod() throws MyException {
		
			doStuff();
	}

	private static void doStuff() throws MyException {
		
		try {
			throw new MyException();
		} catch (MyException me) {
			// TODO Auto-generated catch block
			me.printStackTrace();
		}
		
	}
}
