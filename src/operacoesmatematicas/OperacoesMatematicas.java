package operacoesmatematicas;

public class OperacoesMatematicas {
	public static double somarValores(double... valores) {
		double resultado = 0;
		for (int i = 0; i < valores.length; i++) {
			resultado += valores[i];
			System.out.println("O resultado da soma desses valores é: " + resultado);
		}

		return resultado;
	}

	public static double subtrairValores(double... valores) {
		if (valores.length == 0) {
			throw new ArithmeticException("Nenhum número fornecido para a subtração.");
		}

		double resultado = valores[0];
		for (int i = 1; i < valores.length; i++) {
			if (valores[i] != 0) {
				resultado -= valores[i];
				System.out.println("O resultado da subtração desses valores é: " + resultado);
			} else {
				throw new ArithmeticException("Número negativo.");
			}

		}
		return resultado;
	}

	public static double multiplicarValores(double... valores) {
		if (valores.length == 0) {
			return 1;
		}
		double resultadoMultiplicacao = 1;
		for (double valor : valores) {
			resultadoMultiplicacao *= valor;
			System.out.println("Multiplicação: " + resultadoMultiplicacao);
		}
		return resultadoMultiplicacao;
	}

	public static double dividirValores(double... valores) {
		if (valores.length == 0) {
			throw new ArithmeticException("Nenhum número fornecido para a divisão.");
		}
		double resultado = valores[0];
		for (int i = 1; i < valores.length; i++) {
			if (valores[i] != 0) {
				resultado /= valores[i];
				System.out.println("O resultado da divisão desses valores é: " + resultado);
			} else {
				throw new ArithmeticException("Divisão por zero encontrada.");

			}
		}
		return resultado;
	}

}
