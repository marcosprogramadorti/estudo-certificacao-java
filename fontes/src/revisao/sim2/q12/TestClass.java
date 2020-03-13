package revisao.sim2.q12;

public class TestClass {

	public static void main(String[] args) {

		try {
			doTest();
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println(e);
			// e.printStackTrace();
		} catch (MyException e) {
			System.out.println(e);
			// e.printStackTrace();
		}

	}

	static void doTest() throws MyException {
		int[] array = new int[10];
		//array[10] = 10000;
		doAnotherTest();
	}

	static void doAnotherTest() throws MyException {
		throw new MyException("Exception from doAnotherTest");
	}
}

class MyException extends Exception {
	public MyException(String msg) {
		super(msg);
	}
}
