package Atividade1;

public class Contadores_Recursivos {
	
	//Methods
	public static int  ContadorCresc(int numero) {
		return ContadorCresc(0, numero);		
		
	}
	
	public static int ContadorCresc(int contador, int auxiliar) {
		
		
		if (contador == auxiliar) {
			return contador;
		}
		else {
			System.out.println(contador);
			return ContadorCresc(++contador, auxiliar);
		}
	}
	
	
	public static int  ContadorDecresc(int numero) {
		return ContadorDecresc(numero, 0);		
		
	}
	
	public static int ContadorDecresc(int contador, int auxiliar) {
		
		
		if (contador == auxiliar) {
			return contador;
		}
		else {
			System.out.println(contador);
			return ContadorDecresc(--contador, auxiliar);
		}
	}
	
	public static void Contadores_Cres_Decres(int numero) {
		System.out.println(Contadores_Recursivos.ContadorDecresc(numero,0));
		System.out.println(Contadores_Recursivos.ContadorCresc(1,numero));			
	}
	
	

}


