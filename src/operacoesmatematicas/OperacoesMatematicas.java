package operacoesmatematicas;

public class OperacoesMatematicas {
	public static double somarValores(double... valores) {
		double resultado = 0;
		for (int i = 0; i < valores.length; i++) {
			resultado += valores[i];
			System.out.println("O resultado da soma desses valores �: " + resultado);
		}

		return resultado;
	}

	public static double subtrairValores(double... valores) {
		if (valores.length == 0) {
			throw new ArithmeticException("Nenhum n�mero fornecido para a subtra��o.");
		}

		double resultado = valores[0];
		for (int i = 1; i < valores.length; i++) {
			if (valores[i] != 0) {
				resultado -= valores[i];
				System.out.println("O resultado da subtra��o desses valores �: " + resultado);
			} else {
				throw new ArithmeticException("N�mero negativo.");
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
			System.out.println("Multiplica��o: " + resultadoMultiplicacao);
		}
		return resultadoMultiplicacao;
	}

	public static double dividirValores(double... valores) {
		if (valores.length == 0) {
			throw new ArithmeticException("Nenhum n�mero fornecido para a divis�o.");
		}
		double resultado = valores[0];
		for (int i = 1; i < valores.length; i++) {
			if (valores[i] != 0) {
				resultado /= valores[i];
				System.out.println("O resultado da divis�o desses valores �: " + resultado);
			} else {
				throw new ArithmeticException("Divis�o por zero encontrada.");

			}
		}
		return resultado;
	}

}
