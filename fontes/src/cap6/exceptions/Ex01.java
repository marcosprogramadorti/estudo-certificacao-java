package cap6.exceptions;

import java.io.IOError;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		int a =0;
		doSTuff(a);
	}

	private static void doSTuff(int a) throws IOException  {
		
		
			doMoreStuff(a);
			
	
		
		
	}

	private static void doMoreStuff(int a) throws IOException   {
		
	    int r = 6 / a;
		
	}
}
