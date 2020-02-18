package cap02.avaliacao.questao12;

class Building{
	Building() {
		System.out.println("b");
	}
	Building(String n) {
		this();
		System.out.println("sb" + n);
	}
}
public class House extends Building{
	public House() {
		System.out.println("h");
	}
	public House(String n) {
		this();
		System.out.println("hn" + n);
	}
	
	public static void main(String[] args) {
		new House(" X ");
	}

}
