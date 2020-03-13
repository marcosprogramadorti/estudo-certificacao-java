package revisao.sim.q67;

public class TestClass {
	public static void main(String[] args) {
		Integer i = new Integer(1);
		Integer i2 = new Integer(1);
		Long m = new Long(1);
		
		if (i.equals(m)) {
			System.out.println("sim");
		}else {
			System.out.println("nao");
		}
		if (m.equals(i.longValue())) {
			System.out.println("sim");
		}else {
			System.out.println("nao");
		}
	}
}
