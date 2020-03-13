package revisao.sim.q2;

public class TestClass {
	public static void main(String[] args) {
		char c;
		int i = 0;
		char c2 = (char) i;
		c = 'a';
		i = c;
		i++;
		c=(char)i;
		c++;
		++c;
		System.out.println(c);
	}
}
