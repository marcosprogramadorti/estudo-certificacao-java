package revisao.sim2.q58;

public class Teste {
	public static void main(String[] args) {
		int i = 0;
		loop:{
			try {
				for (; true; i++) {
					if (i==5) {
						break loop;
					}
					System.out.println(i);
				}
			} catch (Exception e) {
				System.out.println("Exception loop");
			}finally {
				System.out.println("Final");
			}
		}
		
	}
}
