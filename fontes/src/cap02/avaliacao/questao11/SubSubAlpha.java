package cap02.avaliacao.questao11;

class Alpha{
	static String s = " ";
	protected Alpha() {
		s+=" ALPHA ";
	}
}
class SubAlpha extends Alpha{
	protected SubAlpha() {
		s+=" SUB ";
	}
}

public class SubSubAlpha extends Alpha{
	private SubSubAlpha() {
		s+=" SUBSUB ";
	}
	
	public static void main(String[] args) {
		new SubSubAlpha();
		System.out.println(s);
	}
}
