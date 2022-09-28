package exercicios_Recursivos;

public class JogosRecursivos {
	
	public static void hanoi(int numeroPinos) {
		hanoi(numeroPinos, 1, 3, 2);
	}
	
	private static void hanoi(int numeroPinos, int inicial, int destino, int proximo) {
		if (numeroPinos > 0) {
			//Ida
			hanoi(numeroPinos - 1, inicial, proximo, destino);
			System.out.println(inicial + " -> " + destino);
			//Volta
			hanoi(numeroPinos - 1, proximo, destino, inicial);
		}
	}
}
