package cap01.avaliacao.questao6;



interface Device {
	public void doIt();
}
abstract  class Phone1 extends Electronic{
	
}
abstract class Phone2 extends Electronic{
	public void doIt(int x) {
		
	}
}
class Phone3 extends Electronic implements Device{
	public void doStuff() {
		
	}
}
public class Electronic implements Device {
	public void doIt() {
		
	}

}
