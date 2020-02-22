package standard.teste2.q4;

class MyException extends Throwable{}
class MyException1 extends MyException{}
class MyException2 extends MyException{}
class MyException3 extends MyException2{}

public class ExceptionTest {
	
	void myMethod() throws MyException3{
		throw new MyException3();
	}
	
	public static void main(String[] args) {
		ExceptionTest et = new ExceptionTest();
		try {
			et.myMethod();
		} catch (MyException3 me) {
			System.out.println("MyException thrown");
		}
		
		finally{System.out.println(" Done");
			System.out.println(" Done");
		}
		
	}

}
