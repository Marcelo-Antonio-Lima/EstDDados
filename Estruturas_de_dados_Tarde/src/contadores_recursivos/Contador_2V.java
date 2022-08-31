package contadores_recursivos;

/**
 * 
 * Contadores com 2 variáveis
 *
 */
public class Contador_2V {
	/**
	 * Chama o método {@link #contar_10_2V_cresc(int controle, int contador)}
	 * controle, int contador) e retorna 10
	 * 
	 * @return retorna 10 ao terminar de contar
	 */
	public static int contar_10_2V_cresc() {
		return contar_10_2V_cresc(0, 0);
	}

	/**
	 * Contador recursivo com 2 variáveis crescente de 0 até 10
	 * 
	 * @param controle Variável de controle
	 * @param contador Variável que serve de contador
	 * @return Retorna 10 ao terminar de contar ou chama a função de forma recursiva
	 *         com anterior recebendo +1
	 */

	private static int contar_10_2V_cresc(int controle, int contador) {

		if (contador == 10) {
			return contador;
		} else {
			System.out.println(contador);
			controle++;
			if (controle == 10) {
				return controle;
			} else {
				contador = controle;
				return contar_10_2V_cresc(controle, contador);
			}
		}
	}

	/**
	 * Chama o método {@link #contar_10_2V_decresc(int, int)} e retorna 0
	 * 
	 * @return retorna 0 ao terminar de contar
	 */
	public static int contar_10_2V_decresc() {
		return contar_10_2V_decresc(10, 10);

	}

	/**
	 * Contador com 2 variáveis decrescente de 10 até 0
	 * 
	 * @param controle Variável de controle
	 * @param contador Variável que serve de contador
	 * @return Retorna 0 ao terminar de contar ou chama a função de forma recursiva
	 *         com controle recebendo -1
	 */
	private static int contar_10_2V_decresc(int controle, int contador) {

		if (contador == 0) {
			return contador;
		} else {
			System.out.println(contador);
			controle--;
			if (controle == 0) {
				return controle;
			} else {
				
				contador = controle;
				return contar_10_2V_decresc(controle, contador);
			}
		}
	}
}
