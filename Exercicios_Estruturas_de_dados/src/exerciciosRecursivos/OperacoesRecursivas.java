package exerciciosRecursivos;

public class OperacoesRecursivas {	
	
	public static int somatorio(int[] vetor) {
		return somatorio(vetor, 0, 0);
	}
	
	private static int somatorio(int[] vetor, int total, int indice) {
		if (indice == vetor.length) {
			System.out.println("Soma dos elementos = " + total);
			return total;
		} else {
			total += vetor[indice];
			return somatorio(vetor, total, indice + 1);
		}
	}
	
	public static int produtorio(int[] vetor) {
		return produtorio(vetor, 1, 0);
	}

	private static int produtorio(int[] vetor, int total, int indice) {
		if (indice == vetor.length) {
			System.out.println("Produto dos elementos = " + total);
			return total;
		} else {
			total *= vetor[indice];
			return produtorio(vetor, total, indice + 1);
		}
	}

	public static float media(int[] vetor) {
		float media = somatorio(vetor) / (float) vetor.length;
		System.out.println("Media dos elementos = " + media);
		return media;

	}
	
	public static int fatorialRecursivo(int fatorial) {
		return fatorialRecursivo(fatorial, 1);
	}
	
	private static int fatorialRecursivo(int fatorial, int total) {
		if (fatorial == 1) {
			return total;
		} else {
			System.out.println(total);
			total *= fatorial;
			return fatorialRecursivo(fatorial - 1, total);
		}
	}

	public static int[] inverterVetorRecursivo(int[] vetor) {
		return inverterVetorRecursivo(vetor, 0);
	}

	private static int[] inverterVetorRecursivo(int[] vetor, int contador) {
		if (contador == vetor.length / 2) {
			return vetor;
		} else {
			int armazenador = vetor[contador];
			vetor[contador] = vetor[(vetor.length - 1) - contador];
			vetor[(vetor.length - 1) - contador] = armazenador;
			return inverterVetorRecursivo(vetor, contador + 1);
		}
	}

	public static int[] organizadorCrescenteRecursivo(int[] vetor) {
		return organizadorCrescenteRecursivo(vetor, 0, 0);
	}
	
	private static int[] organizadorCrescenteRecursivo(int[] vetor, int contadorPrincipal, int contadorAuxiliar) {
		if (contadorPrincipal == vetor.length) {
			return vetor;
		} else {

			if (contadorAuxiliar == vetor.length) {
				return organizadorCrescenteRecursivo(vetor, contadorPrincipal + 1, 0);
			} else {
				if (vetor[contadorPrincipal] < vetor[contadorAuxiliar]) {
					int auxiliar = vetor[contadorAuxiliar];
					vetor[contadorAuxiliar] = vetor[contadorPrincipal];
					vetor[contadorPrincipal] = auxiliar;

				}
				return organizadorCrescenteRecursivo(vetor, contadorPrincipal, contadorAuxiliar + 1);
			}
		}
	}

	
	public static int[] organizadorDecrescenteRecursivo(int[] vetor) {
		return organizadorDecrescenteRecursivo(vetor, 0, 0);
	}
	
	private static int[] organizadorDecrescenteRecursivo(int[] vetor, int contadorPrincipal, int contadorAuxiliar) {
		if (contadorPrincipal == vetor.length) {
			return vetor;
		} else {
			if (contadorAuxiliar == vetor.length) {
				return organizadorDecrescenteRecursivo(vetor, contadorPrincipal + 1, 0);
			} else {
				if (vetor[contadorPrincipal] > vetor[contadorAuxiliar]) {
					int auxiliar = vetor[contadorAuxiliar];
					vetor[contadorAuxiliar] = vetor[contadorPrincipal];
					vetor[contadorPrincipal] = auxiliar;

				}
				return organizadorDecrescenteRecursivo(vetor, contadorPrincipal, contadorAuxiliar + 1);
			}
		}
	}
	
	public static int maiorElemento(int[] vetor) {
		if (vetor.length == 0 || vetor == null) {
			System.out.println("Vetor é nulo ou está vázio");
			return 0;
		} else {
			return maiorElemento(vetor, vetor[0], 0);
		}

	}
	
	private static int maiorElemento(int[] vetor, int maior, int contador) {
		if (contador == vetor.length) {
			System.out.println("Maior elemento = " + maior);
			return maior;
		} else {

			if (maior < vetor[contador])
				maior = vetor[contador];
			return maiorElemento(vetor, maior, contador + 1);
		}
	}
	
	public static int menorElemento(int[] vetor) {

		if (vetor.length == 0 || vetor == null) {
			System.out.println("Vetor é nulo ou está vázio");
			return 0;
		} else {
			return menorElemento(vetor, vetor[0], 0);
		}

	}

	private static int menorElemento(int[] vetor, int menor, int contador) {
		if (contador == vetor.length) {
			System.out.println("Menor elemento = " + menor);
			return menor;
		} else {

			if (menor > vetor[contador])
				menor = vetor[contador];

			return menorElemento(vetor, menor, contador + 1);
		}
	}
	
	public static boolean isPalindromo(String palavra) {
		String palavraMinuscula = palavra.toLowerCase().replace(" ", "");
		return isPalindromo(palavraMinuscula, 0);
	}

	private static boolean isPalindromo(String palavra, int contador) {
		if (contador > (palavra.length() / 2) - 1) {
			return true;
		} else {
			if (palavra.charAt(contador) != palavra.charAt(palavra.length() - contador - 1)) {
				return false;
			} else {
				return isPalindromo(palavra, contador + 1);
			}
		}

	}
}
