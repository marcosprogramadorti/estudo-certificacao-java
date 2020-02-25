package teoria.cap01.ver01;

public abstract class Car implements VerGps{
	private String cor;
	private int ano;
	private String modelo;

	public abstract boolean ligar();
	public abstract boolean freiar();
	
	protected boolean modoSubida() {
	
		return false;
	}
	
	@Override
	public String verInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
