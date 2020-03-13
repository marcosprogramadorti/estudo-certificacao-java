package revisao.sim.q27;

public class TestClass {
	public static int getSwitch(String n) {
		return (int )Math.round(Double.parseDouble(n));
	}
	public static void main(String[] args) {
		System.out.println(getSwitch("-0.5"));
	}
}
