package cap03.autoavaliacao.questao1;

public class Dims {	
	public static void main(String[] args) {
		int[][] a = {{1,2},{3,4}};
		int[] b = (int[]) a[1];
		Object o1 = a;
		
		int[][] a2 = (int[][]) o1;
		
		int[][] b2 = (int[][]) o1;
		
		
		System.out.println(a[0][0]);
		System.out.println(a[1][0]);
		System.out.println(a[0][1]);
		System.out.println(a[1][1]);
		
		
		System.out.println(b[0]);
		System.out.println(b[1]);
		
	}
}
