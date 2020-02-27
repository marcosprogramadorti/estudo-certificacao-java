package cap03.q10;

class Legal {
	protected Legal() {
		System.out.println("Executou o Construtor");
	}
}

class Legal2 extends Legal {
	private Legal2() {

	}
}

public class TestClass extends Legal {
	public static void main(String[] args) {
		new TestClass();
		
		
		float f = (float)454545.4;
		double d = 454545.5454;
		d = f ;
		
		System.out.println(f);
	}
}
