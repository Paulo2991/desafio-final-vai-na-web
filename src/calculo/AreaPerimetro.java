package calculo;

public class AreaPerimetro {
	public static double perimetroQuadrado(double ...ladoQuadrado) {
		double perimetroQuadrado = 0;
		for(double lado : ladoQuadrado) {
			perimetroQuadrado = 4 * lado;
			System.out.println("O perimetro do quadrado: " + perimetroQuadrado);
		}
		return perimetroQuadrado;
	}
	
	public static double perimetroCircunferencia(double ...raioCircunferencia) {
		double raio = 0;
		for(double cicunferencia : raioCircunferencia) {
			raio = 2 * 3.14 * cicunferencia;
			System.out.println("O perimetro da circunferencia é: " + raio);
		}
		return raio;
	}
	
	public static double perimetroTriangulo(double ...somaLados) {
		double soma = 0;
		for(int i = 0; i < somaLados.length; i++) {
			soma += somaLados[i];
			System.out.println("O perimetro do triangulo é: " + soma);
		}
		return soma;
	}
}
