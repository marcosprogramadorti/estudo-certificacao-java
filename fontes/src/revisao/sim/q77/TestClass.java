package revisao.sim.q77;

public class TestClass {
	public static void main(String[] args) {
		Integer i1 = 1; 
		Integer i2 = new Integer(1);
		int i3 = 1; 
		Byte b1 = 1; 
		Long g1 = 1L;
		byte b2 = 1;
		char c = 1;
		System.out.println(i1.longValue()==(b1.longValue()));
	}
}
