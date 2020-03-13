package revisao.sim2.q39;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		String s = sb.toString();
		Object o = s;
		System.out.println(lista.getClass());
		System.out.println(sb.getClass());
		System.out.println(s.getClass());
		System.out.println(o.getClass());
	}
}
