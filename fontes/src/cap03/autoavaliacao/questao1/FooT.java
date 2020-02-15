package cap03.autoavaliacao.questao1;

class Bar{
	int barNum = 28;
}
public class FooT {
	
	Bar myBar = new Bar();
	
	void changeIt(Bar myBar) {
		myBar.barNum = 99;
		System.out.println("myBar in changeIin == " + myBar.barNum);
		myBar = new Bar();
		myBar.barNum = 420;
		System.out.println("myBar in changeIin now == " + myBar.barNum);
	}
	
	public static void main(String[] args) {
		FooT f = new FooT();
		System.out.println("f.myBar.barNum == " + f.myBar.barNum);
		f.changeIt(f.myBar);
		System.out.println("f.myBar.barNum depois do changeIt== " + f.myBar.barNum);
	}
	

}
