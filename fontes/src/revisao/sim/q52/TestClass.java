package revisao.sim.q52;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

class Dados{
	int value;
	public Dados(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return ""+value;
	}
}
public class TestClass {
	
	public static void filtraDados(List<Dados> lista, Predicate<Dados> p) {
		Iterator<Dados> it = lista.iterator();
		while (it.hasNext()) {
			if (p.test(it.next())) {
				it.remove();
			}
			
		}
	};
	
	public static void main(String[] args) {
		List<Dados> lista = new ArrayList<Dados>(); 
		
		Dados da = new Dados(1);
		Dados db = new Dados(2);
		Dados dc = new Dados(3);
		Dados dd = new Dados(4);
		
		lista.add(da);
		lista.add(db);
		lista.add(dc);
		lista.add(dd);
		System.out.println(lista);
		Predicate<Dados> pares = (Dados y)-> y.value%2==0;
		filtraDados(lista, pares);
		System.out.println();
		System.out.println(lista);
		
		
	}
	
}
