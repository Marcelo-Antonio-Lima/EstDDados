package exercicios_Recursivos;

/**
 * Classe com operações com vetores de modo recursivo
 *
 */
public class Operacoes_recursivas {
	/**
	 * Chama o método {@link #somatorio(int[], int, int)} para somar todos os
	 * inteiros do vetor
	 * 
	 * @param vetor Vetor a ser passado para realizar o somatório
	 * @return Retorna o somatório do vetor passado
	 */
	public static int somatorio(int[] vetor) {
		return somatorio(vetor, 0, 0);
	}

	/**
	 * Realiza o somatório do vetor passado de forma recursiva
	 * 
	 * @param vetor  Vetor com os inteiros a serem somados
	 * @param total  Total da soma dos inteiros do vetor
	 * @param indice Índice de busca do vetor, usado para percorrer o vetor
	 * @return Retorna o somatório do vetor passado quando indice for igual ao
	 *         tamanho do vetor
	 */
	private static int somatorio(int[] vetor, int total, int indice) {
		if (indice == vetor.length) {
			return total;
		} else {
			System.out.println("Soma dos elementos = " + total);
			total += vetor[indice];
			return somatorio(vetor, total, indice + 1);
		}
	}

	/**
	 * Chama o método {@link #produtorio(int[], int, int)} para realizar o produto
	 * de todos os inteiros do vetor
	 * 
	 * @param vetor Vetor a ser passado para realizar o produtório
	 * @return Retorna o produtório do vetor passado
	 */
	public static int produtorio(int[] vetor) {
		return produtorio(vetor, 1, 0);
	}

	/**
	 * Realiza o produtório do vetor passado de forma recursiva
	 * 
	 * @param vetor  Vetor com os inteiros a serem somados
	 * @param total  Total do produto dos inteiros do vetor
	 * @param indice Índice de busca do vetor, usado para percorrer o vetor
	 * @return Retorna o produtório do vetor passado quando indice for igual ao
	 *         tamanho do vetor
	 */
	private static int produtorio(int[] vetor, int total, int indice) {
		if (indice == vetor.length) {
			return total;
		} else {
			System.out.println("Produto dos elementos = " + total);
			total *= vetor[indice];
			return produtorio(vetor, total, indice + 1);
		}
	}

	/**
	 * Faz a média aritimética de um vetor, realizando a soma utilizando
	 * {@link #somatorio(int[])} e dividindo pelo tamanho do vetor
	 * 
	 * @param vetor Vetor a ser passado para realizar a média aritimética
	 * @return Retorna a média aritimética do vetor passado
	 */
	public static float media(int[] vetor) {

		return somatorio(vetor) / (float) vetor.length;

	}

	/**
	 * Chama o método {@link #fatorial_recursivo(int, int)} para realizar o fatorial
	 * do inteiro passado
	 * 
	 * @param fatorial Inteiro no qual será feito o fatorial
	 * @return Retorna o fatorial do inteiro passado
	 */
	public static int fatorial_recursivo(int fatorial) {
		return fatorial_recursivo(fatorial, 1);
	}

	/**
	 * Realiza o fatorial de um inteiro passado de forma recursiva
	 * 
	 * @param fatorial Inteiro a ser multiplicado pelo total, subtraindo 1 a cada
	 *                 chamada da função até 1
	 * @param total    Total da operação de fatorial
	 * @return retorna o total quando fatorial = 1
	 */
	private static int fatorial_recursivo(int fatorial, int total) {
		if (fatorial == 1) {
			return total;
		} else {
			System.out.println(total);
			total *= fatorial;
			return fatorial_recursivo(fatorial - 1, total);
		}
	}

	/**
	 * Chama o método {@link #inverter_Vetor_Recursivo(int[], int[], int)} para
	 * inverter o vetor de modo recursivo
	 * 
	 * @param vetor Vetor a ser invertido
	 * @return Retorna um vetor com os elementos do vetor passado com seus
	 *         parâmetros em ordem invertida
	 */
	public static int[] inverter_Vetor_Recursivo(int[] vetor) {
		int[] auxiliar = new int[vetor.length];
		return inverter_Vetor_Recursivo(vetor, auxiliar, 0);
	}

	/**
	 * Inverte as posições do vetor passado de forma recursiva
	 * 
	 * @param vetor    Vetor a ser invertido
	 * @param auxiliar Vetor auxiliar,que recebe os elementos do vetor principal, é
	 *                 retornado ao fim da operação
	 * @param indice   Índice de busca do vetor, usado para percorrer o vetor
	 * @return Retorna um vetor com os elementos do vetor passado com seus
	 *         parâmetros em ordem invertida
	 */
	private static int[] inverter_Vetor_Recursivo(int[] vetor, int[] auxiliar, int indice) {
		if (indice == vetor.length) {
			return auxiliar;
		} else {
			auxiliar[vetor.length - indice - 1] = vetor[indice];
			return inverter_Vetor_Recursivo(vetor, auxiliar, indice + 1);
		}
	}

	/**
	 * Chama o método {@link #organizador_Crescente_Recursivo(int[], int, int)} para
	 * organizar um vetor do tipo inteiro de forma recursiva
	 * 
	 * @param vetor Vetor a ser organizado
	 * @return Retorna um vetor com os inteiros do vetor passado em ordem crescente
	 */
	public static int[] organizador_Crescente_Recursivo(int[] vetor) {
		return organizador_Crescente_Recursivo(vetor, 0, 0);
	}

	/**
	 * Organiza o vetor passado em ordem crescente usando recursividade
	 * 
	 * @param vetor            Vetor a ser organizado de forma recursiva
	 * @param indice_principal Índice de busca do vetor, usado para percorrer o
	 *                         vetor
	 * @param indice_auxiliar  Índice de busca do vetor, usado para percorrer o
	 *                         vetor
	 * @return Retorna um vetor com os inteiros do vetor passado em ordem crescente
	 */
	private static int[] organizador_Crescente_Recursivo(int[] vetor, int indice_principal, int indice_auxiliar) {
		if (indice_principal == vetor.length) {
			return vetor;
		} else {

			if (indice_auxiliar == vetor.length) {
				return organizador_Crescente_Recursivo(vetor, indice_principal + 1, 0);
			} else {
				if (vetor[indice_principal] < vetor[indice_auxiliar]) {
					int auxiliar = vetor[indice_auxiliar];
					vetor[indice_auxiliar] = vetor[indice_principal];
					vetor[indice_principal] = auxiliar;

				}
				return organizador_Crescente_Recursivo(vetor, indice_principal, indice_auxiliar + 1);
			}
		}
	}

	/**
	 * Chama o método {@link #organizador_Decrescente_Recursivo(int[], int, int)}
	 * para organizar um vetor do tipo inteiro de forma recursiva
	 * 
	 * @param vetor Vetor a ser organizado
	 * @return Retorna um vetor com os inteiros do vetor passado em ordem
	 *         decrescente
	 */
	public static int[] organizador_Decrescente_Recursivo(int[] vetor) {
		return organizador_Decrescente_Recursivo(vetor, 0, 0);
	}

	/**
	 * Organiza o vetor passado em ordem decrescente usando recursividade
	 * 
	 * @param vetor            Vetor a ser organizado de forma recursiva
	 * @param indice_principal Índice de busca do vetor, usado para percorrer o
	 *                         vetor
	 * @param indice_auxiliar  Índice de busca do vetor, usado para percorrer o
	 *                         vetor
	 * @return Retorna um vetor com os inteiros do vetor passado em ordem
	 *         decrescente
	 */
	private static int[] organizador_Decrescente_Recursivo(int[] vetor, int indice_principal, int indice_auxiliar) {
		if (indice_principal == vetor.length) {
			return vetor;
		} else {
			if (indice_auxiliar == vetor.length) {
				return organizador_Decrescente_Recursivo(vetor, indice_principal + 1, 0);
			} else {
				if (vetor[indice_principal] > vetor[indice_auxiliar]) {
					int auxiliar = vetor[indice_auxiliar];
					vetor[indice_auxiliar] = vetor[indice_principal];
					vetor[indice_principal] = auxiliar;

				}
				return organizador_Decrescente_Recursivo(vetor, indice_principal, indice_auxiliar + 1);
			}
		}
	}
}
