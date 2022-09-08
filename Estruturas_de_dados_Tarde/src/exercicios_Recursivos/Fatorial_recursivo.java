package exercicios_Recursivos;

public class Fatorial_recursivo {
	public static int fatorial_recursivo(int fator) {
		return fatorial_recursivo(fator, 1);
	}

	public static int fatorial_recursivo(int fator, int auxiliar) {
		if (fator == 1) {
			return auxiliar;
		} else {
			System.out.println(auxiliar);
			auxiliar *= fator;
			return fatorial_recursivo(fator - 1, auxiliar);
		}
	}
}
