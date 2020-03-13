package revisao.sim.q38;
class Super{
	
}
public class TestClass extends Super{
	public static void main(String[] args) {
		Super s = new Super();
		TestClass t = new TestClass();
		s = t;
		s = (Super)t;
		
	}
}
