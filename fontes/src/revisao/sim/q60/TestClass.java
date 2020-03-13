package revisao.sim.q60;

import java.util.ArrayList;

abstract class Veiculo{
	
}
interface Dirigivel{
	
}
class Car extends Veiculo implements Dirigivel{
	
}
class SUV extends Car{
	
}
public class TestClass {
	public static void main(String[] args) {
		ArrayList<Veiculo> l = new ArrayList<>();
		l.add(new SUV());
		ArrayList<Dirigivel> l2 = new ArrayList<>(); 
		l2.add(new Car());
		
	}
}
