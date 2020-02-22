package standard.teste2.q39;

import java.util.*;

interface Ia {

}

class A implements Ia {

}

public class TestClass {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder("mrx");
		String s = sb.toString();
		list.add(s);
		Ia a = new A();
		System.out.println(s.getClass());
		System.out.println(list.getClass());
		System.out.println(a.getClass());
	}
}
