package cap06.trys;

public class TraysECatch {
	
	public static void main(String[] args) {
		//doTest1();
		doTest2();
		System.out.println("TraysECatch.main()");
	}
	
	private static void doTest2() {
		String a = null;
		 doTA(a);
	}

	private static void doTA(String a) {
		System.out.println("TraysECatch.doTA()");
		doTb();
		
	}

	private static void doTb() {
		System.out.println("TraysECatch.doTb()");
		try{
			doTC();
		}
		catch (Exception e){
			e.printStackTrace();
			System.out.println("TraysECatch.doTb() catche");
		}
	}

	private static void doTC() {
		System.out.println("TraysECatch.doTC()");
		doTD();
	}

	private static void doTD() {
		System.out.println("TraysECatch.doTD()");
		int a = 2;
		int b = 0;
		String d = null;
		d.toLowerCase();
		
	}

	/**
	 * 
	 */
	private static void doTest1() {
		String a = null;
		try {
			doA(a);
		}
		catch(Exception e ){
			System.out.println("1 Excetion");
			System.out.println("2 Excetion");
		}
		finally{
			System.out.println("1 finally");
			System.out.println("2 finally");
		}
	}

	/**
	 * @param a
	 */
	private static void doA(String a) {
		System.out.println("1 try");
		a.toString();
		System.out.println("2 try");
	}
	
}
	