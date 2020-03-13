package revisao.sim2.q69;

interface Flyer{
	String getName();
}

class Bird implements Flyer {
	String name;
	
	public Bird(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		return name;
	}
}

class Eagle extends Bird{
	public Eagle(String name ) {
		super(name);
	}
}

public class Teste {
		public static void main(String[] args) {
			Flyer f = new Eagle("American Bald Eagle");
			System.out.println(((Bird)f).name);
			System.out.println(((Eagle)f).name);
			System.out.println(f.getName());
			//System.out.println(f.name);
		}
}


