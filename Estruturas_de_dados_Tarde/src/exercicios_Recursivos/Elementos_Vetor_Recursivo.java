package exercicios_Recursivos;

/**
 * Classe com metodos de busca em vetores de modo recursivo
 *
 */
public class Elementos_Vetor_Recursivo {
	/**
	 * Chama o metodo {@link #maior_elemento(int[], int, int)} passando o vetor como
	 * parâmetro
	 * 
	 * @param vetor Vetor a ser varrido
	 * @return Chama a função sobrecarregada {@link #maior_elemento(int[], int, int) Maior_elemento} e retorna o maior inteiro do vetor
	 */

	public static int maior_elemento(int[] vetor) {
		return maior_elemento(vetor, vetor[0], 0);
	}

	/**
	 * Varre um vetor de forma recursiva em busca do maior inteiro, sendo passados 3
	 * parâmetros
	 * 
	 * @param vetor  Vetor a ser varrido
	 * @param maior  Maior inteiro encontrado no vetor
	 * @param indice Índice de busca do vetor, usado para percorrer o vetor
	 * @return Retorna o maior inteiro encontrado no vetor ou chama a função de
	 *         forma recursiva com indice recebendo + 1
	 */
	private static int maior_elemento(int[] vetor, int maior, int indice) {
		if (indice == vetor.length) {
			return maior;
		} else {

			if (maior < vetor[indice]) {
				System.out.println("Maior elemento = " + maior);
				maior = vetor[indice];
			}

			return maior_elemento(vetor, maior, indice + 1);
		}
	}

	/**
	 * Chama o metodo {@link #menor_elemento(int[], int, int)} passando o vetor como
	 * parâmetro
	 * 
	 * @param vetor Vetor a ser varrido
	 * @return Chama a função sobrecarregada
	 *         {@link #menor_elemento(int[], int, int) Menor_elemento} e retorna o menor inteiro do
	 *         vetor
	 */
	public static int menor_elemento(int[] vetor) {
		return menor_elemento(vetor, vetor[0], 0);
	}

	/**
	 * Varre um vetor de forma recursiva em busca do menor inteiro, sendo passados 3
	 * parâmetros
	 * 
	 * @param vetor  Vetor a ser varrido
	 * @param menor  Menor inteiro encontrado no vetor
	 * @param indice Índice de busca do vetor, usado para percorrer o vetor
	 * @return Retorna o menor inteiro encontrado no vetor ou chama a função de
	 *         forma recursiva com indice recebendo + 1
	 */
	private static int menor_elemento(int[] vetor, int menor, int indice) {
		if (indice == vetor.length) {
			return menor;
		} else {

			if (menor > vetor[indice]) {
				System.out.println("Menor elemento = " + menor);
				menor = vetor[indice];
			}

			return menor_elemento(vetor, menor, indice + 1);
		}
	}

}
