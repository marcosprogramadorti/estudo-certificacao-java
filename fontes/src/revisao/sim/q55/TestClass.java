package revisao.sim.q55;

import java.util.HashMap;
import java.util.Map;

public class TestClass {
	public static void main(String[] args) {
		Map<String, String> lista = new HashMap<String, String>();
		lista.put("AAA", "111");
		lista.put("BBB", "222");
		lista.put("CCC", "333");
		
		System.out.println(lista.keySet());
	}
}
