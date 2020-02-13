package cap06.autoavaliacao;

public class AutoAvaliacao {
	
	static String s = "-";
	

	public static void main(String[] args)  {
		//questao01();
		//testSubString("MARCOS FERREIRA TAVARARES");
		//questao02();
		//questao04(args);
		//questao05();
		//questao06();
		try {
			
			throw new Exception();
			
			
		} catch (Exception e) {
			try {
				try {
					throw new Exception();
				} catch (Exception e2) {
					s+="ic ";
				}
				throw new Exception();
			} catch (Exception e2) {
				s+="mc ";
			}
			finally{
				s+="mf ";
			}
		} finally {
			s +="of ";
		}
		System.out.println(s);
	}

	private static void questao06() {
		
		
	}

	private static void questao05() {
		int[] x = {7,6,5,4,3,2,1};
		//for(int y : x) {
		//int y = 0; for(y : x) {
		//for (int y=0, z=0; z < x.length; z++) { y = x[z];
		//for (int y=0, int z=0; z < x.length; z++) { y = x[z];
		int y=0; for (int z=0; z < x.length; z++) { y = x[z];
			System.out.println(y + " ");
		}
		
	}

	private static void questao04(String[] args) {
		String o = "-";
		String[] sa = new String[4];
		for (int i = 0; i < args.length; i++)
			sa[i] =args[i];
		for (String n : sa) {
			switch (n.toLowerCase()) {
			case "yellow": o+="y";
			case "red": o+="r";
			case "green": o+="g";
					
			
			}
		}
		System.out.println(o);
	}

	private static void s1() {
		try {
			s2();
		} catch (Exception e) {
			s +=  "c";
		}
		
	}

	private static void s2() throws Exception {
		s3(); 
		s +="2";
		s3(); 
		s +="2b";
		
		
	}

	private static void s3() throws Exception {
		throw new Exception();
		
	}

	private static void questao02() {
		new AutoAvaliacao().s1();
		System.out.println(s);
		
	}

	private static void testSubString(String s) {
		
		System.out.println(s.substring(6,10));
		
	}

	/**
	 * 
	 */
	private static void questao01() {
		String o = "-";
		switch ("FRED".toLowerCase().substring(1,4)) {
		case "yellow" : 
			o+="y";
		case "red" :
			o+="r";
		case "green" : 
			o+="g";
		}
		System.out.println(o);
	}

}


