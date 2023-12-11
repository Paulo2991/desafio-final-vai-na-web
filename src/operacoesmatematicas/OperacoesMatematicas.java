package operacoesmatematicas;

import java.util.Scanner;

public class OperacoesMatematicas {
	static Scanner entrada = new Scanner(System.in);
	public static double somarValores(double valor1, double valor2) {
		double resultado = 0;
		resultado = valor1 + valor2;
		System.out.println("O resultado da soma desses valores é: " + resultado);
		return resultado;
	}

	public static void subtrairValores(double valor1, double valor2) {
		do {
			System.out.println("O primeiro valor não pode ser maior que o segundo valor, digite outro numero:");
			System.out.println("Informe o primeiro valor: ");
			valor1 = entrada.nextDouble();
			System.out.println("Informe o segundo valor: ");
			valor2 = entrada.nextDouble();
			break;
		} while (valor1 > valor2);
		double resultado = valor1 - valor2;
		System.out.println("O resultado da subtração desses valores é: " + resultado);
	}

	public static double multiplicarValores(double valor1, double valor2) {
		double resultado = valor1 * valor2;
		System.out.println("O resultado da subtração desses valores é: " + resultado);
		return resultado;
	}

	public void dividirValores(double valor1, double valor2) {
		do {
			System.out.println("O resultado do dividendo não pode ser igual ou menor que 0:");
			System.out.println("Informe o segundo valor: ");
			valor2 = entrada.nextDouble();
			break;
		} while (valor2 <= 0);
		double resultado = valor1 / valor2;
		System.out.println("O resultado da subtração desses valores é: " + resultado);
	}
}
