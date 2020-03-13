package revisao.sim.q11;

public class TestClass {
	public static void main(String[] args) {
		String myString = "good";
		char[] a = {'g','o','o','d'};
		String newStrng = null;
		for(char c: a) {
			newStrng = newStrng + c;
		}
		System.out.println((myString==newStrng) + " " + (myString.equals(newStrng)));
		System.out.println(newStrng);
	}
}
