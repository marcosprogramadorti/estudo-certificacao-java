package cap03.q11;

class Foo{
	void doFoo(){
		System.out.println("Foo.doFoo()");
	}
}
class Bar extends Foo{
	void doBar() {
		System.out.println("Bar.doBar()");
	}
}
public class TestClass {
	public static void main(String[] args) {
		Foo f = new Bar();
		
		Bar b = (Bar)f;
		b.doBar();
	}
}
