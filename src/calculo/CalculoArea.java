package calculo;

import java.util.Scanner;

public class CalculoArea {
	static Scanner entrada = new Scanner(System.in);
	static int op = 0;
	public static void calcularVolume() {
		do {
			System.out.println("Escolha a forma geométrica:");
			System.out.println("1 - Cubo:");
			System.out.println("2 - Esfera:");
			System.out.println("3 - Cilindro:");
			System.out.println("4 - Sair Do Menu:");
			op = entrada.nextInt();
			switch (op) {
			case 1:
				System.out.println("Informe o valor da aresta do cubo: ");
				float arestaCubo = entrada.nextFloat();
				float volumeCubo = arestaCubo * arestaCubo * arestaCubo;
				System.out.println("O volume do cubo é: " + volumeCubo);
				break;
			case 2:
				System.out.println("Informe o raio da esfera: ");
				double raioEsfera = entrada.nextFloat();
				double volumeEsfera = (4 / 3) * 3.14 * raioEsfera * raioEsfera * raioEsfera;
				System.out.println("O volume da esfera é: " + volumeEsfera);
				break;
			case 3:
				System.out.println("Informe o raio do cilindro: ");
				double raioCilindro = entrada.nextDouble();
				System.out.println("Informe altura do cilindro: ");
				double alturaCilindro = entrada.nextDouble();
				double volumeCilindro = 3.14 * raioCilindro * raioCilindro * alturaCilindro;
				System.out.println("O volume do cilindro é: " + volumeCilindro);
				break;
			case 4:
				System.out.println("Saindo do menu: ");
				break;
			default:
				break;
			}
		} while (op != 4);
	}

	public static void calcularPerimetro() {
		do {
			System.out.println("Escolha a forma geométrica:");
			System.out.println("1 - Quadrado:");
			System.out.println("2 - Círculo:");
			System.out.println("3 - Triângulo:");
			System.out.println("4 - Sair Do Menu:");
			int op = entrada.nextInt();
			switch (op) {
			case 1:
				System.out.println("Informe o lado do quadrado: ");
				double ladoQuadrado = entrada.nextDouble();
				double perimetroQuadrado = 4 * ladoQuadrado;
				System.out.println("O resultado do perimetro do quadrado é:" + perimetroQuadrado);
				break;
			case 2:
				System.out.println("Informe o raio da circunfêrencia: ");
				double raioCircunferencia = entrada.nextDouble();
				double comprimentoCircunferencia = 2 * 3.14 * raioCircunferencia;
				System.out.println("O comprimento da circunfêrencia é : " + comprimentoCircunferencia);
				break;
			case 3:
				System.out.println("Informe o primeiro valor do lado do triângulo: ");
				double ladoPrimeiroTriangulo = entrada.nextDouble();
				System.out.println("Informe o segundo valor do lado do triângulo: ");
				double ladoSegundoTriangulo = entrada.nextDouble();
				System.out.println("Informe o terceiro valor do lado do triângulo: ");
				double ladoTerceiroTriangulo = entrada.nextDouble();
				double somaLadosTriangulo = ladoPrimeiroTriangulo + ladoSegundoTriangulo + ladoTerceiroTriangulo;
				System.out.println("A soma dos lados do triangulo é: " + somaLadosTriangulo);
				break;
			case 4:
				System.out.println("Saindo do menu: ");
				break;
			default:
				break;
			}
		} while (op != 4);
	}

	public static void calcularArea() {
		do {
			System.out.println("Escolha a forma geométrica:");
			System.out.println("1 - Quadrado:");
			System.out.println("2 - Círculo:");
			System.out.println("3 - Triângulo:");
			System.out.println("4 - Sair do Menu:");
			int op = entrada.nextInt();
			switch (op) {
			case 1:
				System.out.println("Informe o lado do quadrado: ");
				double ladoQuadrado = entrada.nextDouble();
				double areaQuadrado = ladoQuadrado * ladoQuadrado;
				System.out.println("Area do quadrado: " + areaQuadrado);
				break;
			case 2:
				System.out.println("Informe o raio da circunferência: ");
				double raioCirculo = entrada.nextDouble();
				double areaRaio = 3.14 * raioCirculo * raioCirculo;
				System.out.println("Area do quadrado: " + areaRaio);
				break;
			case 3:
				System.out.println("Informe a base: ");
				double base = entrada.nextDouble();
				System.out.println("Informe a altura: ");
				double altura = entrada.nextDouble();
				double areaTriangulo = base * altura;
				System.out.println("Area do quadrado: " + areaTriangulo);
				break;
			case 4:
				System.out.println("Saindo do menu:");
				break;
			default:
				break;
			}
		} while (op != 4);

	}
}
