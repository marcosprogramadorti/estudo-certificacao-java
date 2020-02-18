package cap02.avaliacao.questao2;


class Top{
	public Top(String s){
		System.out.println("Top.Top() - com parametro");
	}
	public Top() {
		System.out.println("Top.Top()");
	}
}

public class Button2  extends Top{
	public Button2( String s) {
		//super(s);
		System.out.print("D");
	}
	public static void main(String[] args) {
		new Button2("c");
		System.out.println("Button2.main()");
	}
}
