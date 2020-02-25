package teoria.cap01.ver01;

public class Gol extends Car implements VerGps{

	@Override
	public boolean ligar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean freiar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modoSubida() {
		// TODO Auto-generated method stub
		return super.modoSubida();
	}

	public static void main(String[] args) {
		Gol g = new Gol();
		g.modoSubida();
		g.verInfo();
	}

	

	

}
