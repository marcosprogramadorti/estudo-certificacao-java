package revisao.sim.q45;

import java.io.IOException;

class Base {
	public int getVal() {
		return 1;
	}
}

class Base2 extends Base{
	
	public int getVal() {
		return 2;
	}
}

public class TestClass {
	public static void main(String[] args) throws IOException {
		Base b = new Base2();
		System.out.println(b.getVal());
	}
}
