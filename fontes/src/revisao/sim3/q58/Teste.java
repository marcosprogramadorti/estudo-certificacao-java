package revisao.sim3.q58;

public class Teste {
	public static void main(String[] args) {
		int i = 0;
		loop:{
			System.out.println("legal");
			
			try {
				for (; true; i++) {
					System.out.println(i);
					//if (i==5) break loop	;
				}
			} catch (Exception e) {
				System.out.println("catch in loop");
			}
			finally {
				System.out.println("finally in loop");
			}
			
				
		}
		
	}
}
