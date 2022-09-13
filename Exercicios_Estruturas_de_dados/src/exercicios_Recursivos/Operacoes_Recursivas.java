package exercicios_Recursivos;

/**
 * Classe com operações com vetores de modo recursivo
 *
 */
public class Operacoes_Recursivas {
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
			System.out.println("Soma dos elementos = " + total);
			return total;
		} else {
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
	 * @param vetor  Vetor com os inteiros a serem multiplicados
	 * @param total  Total do produto dos inteiros do vetor
	 * @param indice Índice de busca do vetor, usado para percorrer o vetor
	 * @return Retorna o produtório do vetor passado quando indice for igual ao
	 *         tamanho do vetor
	 */
	private static int produtorio(int[] vetor, int total, int indice) {
		if (indice == vetor.length) {
			System.out.println("Produto dos elementos = " + total);
			return total;
		} else {
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
		float media = somatorio(vetor) / (float) vetor.length;
		System.out.println("Media dos elementos = " + media);
		return media;

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

	/**
	 * Chama o metodo {@link #maior_elemento(int[], int, int)} passando o vetor como
	 * parâmetro
	 * 
	 * @param vetor Vetor a ser varrido
	 * @return Retorna 0 caso o vetor estiver vazio ou for nulo, caso contrário
	 *         chama a função sobrecarregada {@link #maior_elemento(int[], int, int)
	 *         Maior_elemento} e retorna o maior inteiro do vetor
	 */

	public static int maior_elemento(int[] vetor) {
		if (vetor.length == 0 || vetor == null) {
			System.out.println("Vetor é nulo ou está vázio");
			return 0;
		} else {
			return maior_elemento(vetor, vetor[0], 0);
		}

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
			System.out.println("Maior elemento = " + maior);
			return maior;
		} else {

			if (maior < vetor[indice])
				maior = vetor[indice];
			return maior_elemento(vetor, maior, indice + 1);
		}
	}

	/**
	 * Chama o metodo {@link #menor_elemento(int[], int, int)} passando o vetor como
	 * parâmetro
	 * 
	 * @param vetor Vetor a ser varrido
	 * @return Retorna 0 caso o vetor estiver vazio ou for nulo, caso contrário
	 *         chama a função sobrecarregada {@link #menor_elemento(int[], int, int)
	 *         Menor_elemento} e retorna o menor inteiro do vetor
	 */
	public static int menor_elemento(int[] vetor) {

		if (vetor.length == 0 || vetor == null) {
			System.out.println("Vetor é nulo ou está vázio");
			return 0;
		} else {
			return menor_elemento(vetor, vetor[0], 0);
		}

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
			System.out.println("Menor elemento = " + menor);
			return menor;
		} else {

			if (menor > vetor[indice])
				menor = vetor[indice];

			return menor_elemento(vetor, menor, indice + 1);
		}
	}

	/**
	 * Realiza todas as permutações possiveis de uma palavra
	 * 
	 * @param palavra          Palavra que será permutada em forma de vetor de
	 *                         characteres
	 * @param indice_principal Índice de busca do vetor, usado para percorrer o
	 *                         vetor
	 * @param indice_auxiliar  Índice de busca do vetor, usado para percorrer o
	 *                         vetor
	 */
	private static void permutacoes_string(char[] palavra, int indice_principal, int indice_auxiliar) {
		char letrafixa, letratroca;
		char[] palavra_auxiliar = palavra.clone();

		if (indice_principal == palavra.length) {
			System.out.println("Fim");
		} else {
			if (indice_auxiliar == palavra.length) {
				permutacoes_string(palavra, indice_principal + 1, 0);
			} else {
				letrafixa = palavra[indice_principal];
				letratroca = palavra[indice_auxiliar];
				palavra_auxiliar[indice_auxiliar] = letrafixa;
				palavra_auxiliar[indice_principal] = letratroca;
				System.out.println(palavra_auxiliar);
				permutacoes_string(palavra, indice_principal, indice_auxiliar + 1);
			}
		}
	}

	/**
	 * Chama o método {@link #permutacoes_string(char[], int, int)} para realizar
	 * todas as permutações possiveis de uma palavra
	 * 
	 * @param palavra Palavra a ser permutada
	 */
	public static void permutacoes_string(String palavra) {
		char[] palavra_chars = palavra.toCharArray();
		permutacoes_string(palavra_chars, 0, 0);
	}

	/**
	 * Chama o método {@link #teste_Palindromo(String, int)} para verificar se a
	 * String passada é um palindromo
	 * 
	 * @param palavra String a ser verificada
	 * @return Retorna verdadeiro caso a String for um palindromo, falso caso não
	 */
	public static boolean teste_Palindromo(String palavra) {
		String palavra_minuscula = palavra.toLowerCase();
		return teste_Palindromo(palavra_minuscula, 0);
	}

	/**
	 * Verifica se a String passada é um palindromo de forma recursiva
	 * 
	 * @param palavra String a ser verificada
	 * @param indice  Índice de busca do vetor, usado para percorrer o vetor
	 * @return Retorna verdadeiro caso a String for um palindromo, falso caso não
	 */
	private static boolean teste_Palindromo(String palavra, int indice) {
		if (indice > (palavra.length() / 2) - 1) {
			return true;
		} else {
			if (palavra.charAt(indice) != palavra.charAt(palavra.length() - indice - 1)) {
				return false;
			} else {
				return teste_Palindromo(palavra, indice + 1);
			}
		}

	}
}
