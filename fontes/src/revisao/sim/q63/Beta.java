package revisao.sim.q63;

class Beap {
	public int h = 4;

	public int getH() {
		System.out.println("beap h " + h );
		return h;
	}
}

public class Beta extends Beap{
	public int h = 44;
	public int getH() {
		System.out.println("Beta h " + h);
		return h;
	}
	
	public static void main(String[] args) {
		Beap b = new Beta();
		Beta bb = (Beta)b;
		System.out.println(b.h + " " + b.getH()) ;
		System.out.println(bb.h + " " + bb.getH()) ;
	}
}
