package revisao.sim.q43;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestClass {
	public static boolean checkList(List lista, Predicate<List> p) {
		return p.test(lista);
	}
	public static void main(String[] args) {
		checkList(new ArrayList<String>(), al->al.isEmpty());
	}
}
