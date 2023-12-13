package calculo;


public class CalculoArea {
	
	public static double calcularAreaQuadrado(double ...ladoQuadrado) {
		double areaTotal = 0;
		for(double lados : ladoQuadrado) {
			double area = lados * lados;
			areaTotal += area;
		}
		
		return areaTotal;

	}
	
	public static double calcularCirculo(double ...raioCirculo) {
		double areaRaio = 0;
		for(double raio : raioCirculo) {
			double area = 3.14 * raio * raio;
			areaRaio += area;
		}
		
		return areaRaio;
	}
	
	public static double calcularTriangulo(double ...areaTriangulo) {
		double areaTotal = 0;
		for(int i = 0; i < areaTriangulo.length; i += 2) {
			double base = areaTriangulo[i];
			double altura = areaTriangulo[i + 1];
			double area = (base * altura)/2;
			areaTotal += area;
		}
		
		return areaTotal;
	}
}
