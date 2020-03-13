package revisao.sim3.q29;

import java.util.Collection;
import java.util.Iterator;

public class Teste {
	public void tm() {
		Object o = null;
		Collection c = null;
		for(Object o2 : c){ };
		for(final Object o2 :c){ };// final is the only modifier (excluding annotations) that is allowed here.
		//for(Iterator it : c.iterator()){ }
		/*
		 * c.iterator() does not return any Collection. 
		 * Note that the following would have been valid: 
		 * Collection<Iterator> c = //some collection that contains Iterator objects for(Iterator it : c){ }
		 * 
		 * */
		
		int[][] ia = null;
		for(int i : ia[0]){ }
	}
}
