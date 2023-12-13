package desafiofinal;

import calculo.AreaPerimetro;
import calculo.AreaVolume;
import juros.JurosSimplesCompostos;
import operacoesmatematicas.OperacoesMatematicas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperacoesMatematicas operacoesMatematicas = new OperacoesMatematicas();
		OperacoesMatematicas.somarValores(45,68,78);
		OperacoesMatematicas operacoesDiminuir = new OperacoesMatematicas();
		OperacoesMatematicas.subtrairValores(68,60,56);
		OperacoesMatematicas operacoesDivisao = new OperacoesMatematicas();
		OperacoesMatematicas.dividirValores(4,2);
		OperacoesMatematicas operacoesValores = new OperacoesMatematicas();
		OperacoesMatematicas.multiplicarValores(34,56,78);
		JurosSimplesCompostos jurosSimplesCompostos = new JurosSimplesCompostos();
		JurosSimplesCompostos.jurosSimples(1000.0,0.05,2);
		JurosSimplesCompostos.jurosCompostos(1000.0, 0.05, 2);
		AreaVolume areaVolume = new AreaVolume();
		AreaVolume.volumeCubo(3.0,4.0,12.0);
		AreaVolume areaEsfera = new AreaVolume();
		AreaVolume.volumeEsfera(3.0,4.0,12.0);
		AreaVolume areaCilindro = new AreaVolume();
		AreaVolume.volumeCilindro(2.0, 5.0, 3.0, 7.0, 1.5, 10.0);
		AreaPerimetro areaPerimetro = new AreaPerimetro();
		areaPerimetro.perimetroQuadrado(2,4,8,16,32);
		AreaPerimetro areaQuadrado = new AreaPerimetro();
		areaPerimetro.perimetroCircunferencia(12,24, 32, 64);
		AreaPerimetro areaTriangulo = new AreaPerimetro();
		areaPerimetro.perimetroTriangulo(2,4,6,8,10);
	}

}
