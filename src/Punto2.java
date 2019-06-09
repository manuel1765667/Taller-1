
public class Punto2 {
	
	private int n = 10;
	private int a[] = new int[1];
	
	
	public Punto2() {
		
		for (int i = 1; i <= n; i++) {
			int x [] = new int[i];
			for(int j = 0; j < i; j++) {
				if(j == 0 || j == (i-1)) {
					x[j] = 1;
				}
				else {
					x[j] = a[j] + a[j - 1];
				}
				
				System.out.print(x[j] + " ");
			}
			a = x;
			System.out.println();
		}
	}
}
