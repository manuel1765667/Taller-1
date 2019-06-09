
public class Punto3 {
	
	private int n, f = 0;
	private int t1 = 1;
	private int t2;
	
	public Punto3() {
		
		n = 10;
		
		for(int i = 0; i < n; i++) {
			t2 = f;
			f  += t1;
			t1 = t2;
			
			System.out.print(t1 + " ");
		}
		
	}
}
