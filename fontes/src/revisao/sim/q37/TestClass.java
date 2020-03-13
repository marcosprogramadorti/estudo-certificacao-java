package revisao.sim.q37;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("a");
		lista.add("b");
		lista.add(1,"c");
		System.out.println();
		List<String> lista2 = new ArrayList<String>(lista.subList(1, 2));
		System.out.println(lista2);
		System.out.println(lista);
		lista.addAll(lista2);
		System.out.println();
		System.out.println(lista);
		
	}
}
