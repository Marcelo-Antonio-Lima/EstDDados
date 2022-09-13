package exercicios_Recursivos;

public class Jogos_recursivos {
	/**
	 * Chama o método {@link #hanoi(int, int, int, int)} para resolver o quebra
	 * cabeça de hansoi para n pinos
	 * 
	 * @param numero_Pinos Número de pinos
	 */
	public static void hanoi(int numero_Pinos) {
		hanoi(numero_Pinos, 1, 3, 2);
	}
	/**
	 * Resolve o quebra cabeça de hansoi de forma recursiva
	 * @param numero_Pinos Número de pinos que estão sendo trabalhados
	 * @param inicial torre de onde o pino será movido
	 * @param destino torre que receberá o pino
	 * @param proximo próxima torre a ser utilizada
	 */
	private static void hanoi(int numero_Pinos, int inicial, int destino, int proximo) {

		if (numero_Pinos > 0) {
			hanoi(numero_Pinos - 1, inicial, proximo, destino);
			System.out.println(inicial + " -> " + destino);
			hanoi(numero_Pinos - 1, proximo, destino, inicial);
		}

	}
}
