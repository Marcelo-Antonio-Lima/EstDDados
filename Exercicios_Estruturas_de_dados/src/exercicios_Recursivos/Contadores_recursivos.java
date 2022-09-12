package exercicios_Recursivos;

/**
 * 
 * Contadores com 1 variável
 *
 */
public class Contadores_recursivos {

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
	public static int contar_10_1V_cresc(int contador) {

		if (contador == 10) {
			return contador;
		} else {
			System.out.println(contador++);
			return contar_10_1V_cresc(contador);
		}
	}

	/**
	 * Chama o método {@link #contar_10_1V_decresc(int)} e retorna 0
	 * 
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

	/**
	 * Chama o método {@link #contador_2V_cresc(int controle, int contador)}
	 * controle, int contador) e retorna 10
	 * 
	 * @return retorna 10 ao terminar de contar
	 */
	public static int contar_10_2V_cresc() {
		return contador_2V_cresc(0, 10);
	}

	/**
	 * Contador crescente recursivo com 2 variáveis
	 * 
	 * @param contador Variável que serve de contador
	 * @param controle Variável de controle
	 * @return Retorna contador ao terminar de contar ou chama a função de forma
	 *         recursiva com o contador recebendo +1
	 */

	public static int contador_2V_cresc(int contador, int controle) {
		if (contador > controle) {
			System.out.println("Número passado " + contador + " É maior que o valor alvo");
			return contador;
		}
		if (contador == controle) {
			return contador;
		} else {
			System.out.println(contador);
			return contador_2V_cresc(contador + 1, controle);
		}
	}

	/**
	 * Chama o método {@link #contar_2V_decresc(int, int)} e retorna 0
	 * 
	 * @return retorna 0 ao terminar de contar
	 */
	public static int contar_10_2V_decresc() {
		return contar_2V_decresc(10, 0);

	}

	/**
	 * Contador com 2 variáveis decrescente
	 * 
	 * 
	 * @param contador Variável que serve de contador
	 * @param controle Variável de controle
	 * @return Retorna controle ao terminar de contar ou chama a função de forma
	 *         recursiva com controle recebendo -1
	 */
	public static int contar_2V_decresc(int contador, int controle) {
		if (contador < controle) {
			System.out.println("Número passado " + contador + " é menor que o valor alvo");
			return contador;
		}
		if (contador == controle) {
			return contador;
		} else {
			System.out.println(contador);
			return contar_2V_decresc(contador - 1, controle);
		}
	}
}
