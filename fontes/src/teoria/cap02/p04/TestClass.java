package teoria.cap02.p04;


interface Gama {
	
}
class Alfa implements Gama {
	public Alfa fazAlgo() {
		System.out.println("faz Algo alfa");
		return new Alfa();
	}
}
class Beta extends Alfa implements Gama{
	
	@Override
	public Beta fazAlgo() {
		System.out.println("faz Algo beta");
		return new Beta();
	}
}
public class TestClass {

}
