package revisao.sim2.q04;


class a extends Exception{
	
}

class MyException extends Throwable{
	
}
class MyException1 extends MyException{
	
}
class MyException2 extends MyException{
	
}
class MyException3 extends MyException2{
	
}

public class TestClass {
	void myMethod() throws MyException3 {
		throw new MyException3();
	}
	public static void main(String[] args) {
		TestClass t = new TestClass();
		try {
			t.myMethod();
		}
		catch (MyException3 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (MyException2 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			System.out.println("fim");
		}
		
	}
}
