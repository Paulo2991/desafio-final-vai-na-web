package juros;

public class JurosSimplesCompostos {

	public static double jurosSimples(double principal, double taxaDeJuros, double tempo) {
		double jurosSimples = principal * taxaDeJuros * tempo;
		System.out.println("Os Juros Simples são é: " + jurosSimples);
		return jurosSimples;
	}

	public static double jurosCompostos(double principal, double taxaJuros) {
		double taxaDecimal = taxaJuros / 100;
		final double tempo = 100;
		double montante = principal * Math.pow(1 + taxaDecimal, tempo);
		System.out.println("Os Juros Compostos são é: " + montante);
		return montante;
	}
}
