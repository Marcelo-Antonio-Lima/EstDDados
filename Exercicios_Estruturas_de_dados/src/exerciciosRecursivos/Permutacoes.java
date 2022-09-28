package exerciciosRecursivos;

import java.util.ArrayList;
import java.util.List;

public class Permutacoes {

	public static void permutacoesString(String palavra) {
		char[] palavraChars = palavra.toCharArray();
		List<String> listaPermutacoes = new ArrayList<>();
		permutacoesString(palavraChars, 0, 0, 0, listaPermutacoes);
	}

	private static void permutacoesString(char[] palavra, int contadorPrincipal, int contadorAuxiliar,
			int contadorPermutacoes, List<String> listaPermutacoes) {
		char[] palavraTrabalho = palavra.clone();
		if (contadorPermutacoes == palavra.length) {
			listaPermutacoes.sort(null);
			imprimirPermutacoes(listaPermutacoes, fatorial(palavra.length) / palavra.length);
		} else {
			if (contadorPrincipal == palavra.length) {
				palavraTrabalho = moverChar(palavraTrabalho);
				permutacoesString(palavraTrabalho, 0, 0, contadorPermutacoes + 1, listaPermutacoes);
			} else {
				if (contadorAuxiliar == palavra.length) {

					permutacoesString(palavra, contadorPrincipal + 1, 0, contadorPermutacoes, listaPermutacoes);
				} else {
					palavraTrabalho = letraTroca(palavraTrabalho, contadorPrincipal, contadorAuxiliar);
					
					listaPermutacoes = verificarPalavra(listaPermutacoes, palavraTrabalho);
					permutacoesString(palavra, contadorPrincipal, contadorAuxiliar + 1, contadorPermutacoes,
							listaPermutacoes);

				}
			}
		}
	}

	private static char[] moverChar(char[] palavra) {
		char[] retorno = new char[palavra.length];
		for (int i = 0; i < palavra.length; i++) {
			if (i == 0) {
				retorno[retorno.length - 1] = palavra[i];
			} else {
				retorno[i - 1] = palavra[i];
			}
		}
		return retorno;
	}

	private static void imprimirPermutacoes(List<String> lista, int nLinhas) {
		for (int i = 0; i < nLinhas; i++) {
			for (int j = 0; j < lista.size() / nLinhas; j++) {
				System.out.print(lista.get(i + j * nLinhas) + " ");
			}
			System.out.println("");
		}
	}

	private static int fatorial(int numero) {
		if (numero <= 1) {
			return 1;
		} else {
			return numero * fatorial(numero - 1);
		}
	}

	private static char[] letraTroca(char[] palavra, int indexTroca, int indexAlvo) {
		char[] retorno = palavra.clone();
		char letraFixa, letraTroca;
		letraFixa = retorno[indexTroca];
		letraTroca = retorno[indexAlvo];
		retorno[indexAlvo] = letraFixa;
		retorno[indexTroca] = letraTroca;
		return retorno;

	}
	
	private static List<String> verificarPalavra(List<String> lista,char[] palavra) {
		if (lista.contains(String.valueOf(palavra))) {
			return lista;

		} else {
			lista.add(String.valueOf(palavra));
			return lista;
		}
	}

}
