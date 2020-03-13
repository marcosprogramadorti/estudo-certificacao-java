package revisao.sim.q53;

public class TestClass {
	public static void main(String[] args) {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("teste lega 2");

			}
		};
		
		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				System.out.println("teste lega 3");

			}
		};
		r2.run();
		r.run();
		System.out.println("teste legal 1");
	}

}
