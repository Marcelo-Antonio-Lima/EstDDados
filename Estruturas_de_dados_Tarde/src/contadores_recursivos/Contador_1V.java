package contadores_recursivos;

/**
 * 
 * Contadores com 1 variável
 *
 */
public class Contador_1V {

	/**
	 * Chama o método {@link #contar_10_1V_cresc(int)} e retorna 10
	 * 
	 * @return retorna 10 ao terminar de contar
	 */

	public static int contar_10_1V_cresc() {
		return contar_10_1V_cresc(0);
	}

	/**
	 * Contador recursivo que conta de 0 até 10
	 * 
	 * @param contador Variável que serve de contador
	 * @return Retorna 10 ao terminar de contar ou chama a função de forma recursiva
	 *         com contador recebendo +1
	 */
	private static int contar_10_1V_cresc(int contador) {

		if (contador == 10) {
			return contador;
		} else {
			System.out.println(contador++);
			return contar_10_1V_cresc(contador);
		}
	}
	/**
	 * Chama o método {@link #contar_10_1V_decresc(int)} e retorna 0
	 * @return retorna 0 ao terminar de contar
	 */
	public static int contar_10_1V_decresc() {
		return contar_10_1V_decresc(10);

	}
	/**
	 * Contador recursivo que conta de 10 até 0
	 * 
	 * @param contador Variável que serve de contador
	 * @return Retorna 0 ao terminar de contar ou chama a função de forma recursiva
	 *         com contador recebendo -1
	 */
	private static int contar_10_1V_decresc(int contador) {

		if (contador == 0) {
			return contador;
		} else {
			System.out.println(contador--);
			return contar_10_1V_decresc(contador);
		}
	}
}
