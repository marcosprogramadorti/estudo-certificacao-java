package cap01.avaliacao.questao4;

enum Animal {
	DOG("WOOF"),
	CAT("MEOW"),
	FISH("BURBLE"),
	OUTRO;
	protected String sound;
	Animal(){
		
	};
	Animal(String s){
		sound = s;
	}
	
}
public class TesteEnum {
	static Animal a;
	public static void main(String[] args) {
		System.out.println(a.DOG.sound + " " + a.FISH.sound + " " + a.OUTRO + " " + a.OUTRO.valueOf("DOG") ) ;
		
		
	}
}
