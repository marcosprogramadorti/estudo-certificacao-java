package standard.teste1.q30;

public class Test {
	public static int[] getArray() {
		return null;
	}
	public static int[] getArrayInt() {
		int[] a = {0,1,2,3};
		return a;
	}

	public static void main(String[] args){
		int index = 1;
		try{
			getArray()[index=0]++;
			}
		catch(Exception e) {
			System.out.println("deu error");
		}	
		System.out.println("index = " + index);
		
		int[] b = {0,2,3,5,6,7};
		
		System.out.println(getArrayInt()[index=2]++);
	}
}
