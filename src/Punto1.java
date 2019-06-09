
public class Punto1 {
	private String mensaje = "anilina";
	private boolean esPal = false;
	private int primerLetra = 0;
	private int ultimaLetra = mensaje.length() - 1;
	
	public Punto1() {
		
		
		for(int i = 0; i < mensaje.length(); i++) {
			if(mensaje.charAt(primerLetra) == mensaje.charAt(ultimaLetra)) {
				primerLetra++;
				ultimaLetra--;
				
			}
			else {
				esPal = true;
				
			}
		}
		
		if(esPal) {
			System.out.print("La palabra " + mensaje + " no es palindroma");
		}
		else {
			System.out.print("La palabra " + mensaje + " es palindroma");
		}
		
	}
}
