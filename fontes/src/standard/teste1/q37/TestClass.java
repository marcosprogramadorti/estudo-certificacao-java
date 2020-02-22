package standard.teste1.q37;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
	public static void main(String args[]) {
		System.out.println();
		List s1 = new ArrayList();
		s1.add("a");
		s1.add("b");
		s1.add(1, "c");
		List s2 = new ArrayList(s1.subList(1, 2));
		System.out.println(s1.subList(4, s1.size()));
		s1.addAll(s2);
		System.out.println(s1);
	}
}
