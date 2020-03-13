package revisao.sim.q13;

public class TestClass {
	public static String hello = "hello";
	public static String lo = "lo";

	public static void main(String[] args) {
		System.out.println(("hel" + lo));
		System.out.println(hello == ("hel" + lo));
		System.out.println(hello == ("hel" + lo).intern());
	}
}
