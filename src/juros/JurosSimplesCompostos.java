package juros;


public class JurosSimplesCompostos {

	public static double jurosSimples(double principal,double taxaDeJuros,double ...tempos) {
		double jurosSimples = 0;
		for(double tempo : tempos) {
			double juros = principal * taxaDeJuros * tempo;
			jurosSimples += juros;
			System.out.println("Os Juros Simples são é: " + jurosSimples);
		}
		return jurosSimples;
	}

	public static double jurosCompostos(double... calculoComposto) {
		double principal = calculoComposto[0];
		double taxaDecimal = calculoComposto[1];
		double tempo = calculoComposto[2];
		double montante = principal * Math.pow(1 + taxaDecimal, tempo);
		double juros = montante - principal;
		System.out.println("Os Juros Compostos são é: " + montante);
		return juros;
	}
}
