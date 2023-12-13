package calculo;

public class AreaVolume {
   public static void volumeCubo(double ...arestaCubo) {
	   for(double aresta : arestaCubo) {
		   double volume = aresta * aresta * aresta;
		   System.out.println("Volume: " + volume);
	   }
   }
   
   public static void volumeEsfera(double ...raioEsfera) {
	   for(double raio : raioEsfera) {
		   double volumeEsfera = (4 / 3) * 3.14 * Math.pow(raio, 3);
		   System.out.println("Volume Esfera: " + volumeEsfera);
	   }
   }
   
   public static void volumeCilindro(double ...calculoCilindro) {
	   for(int i = 0; i < calculoCilindro.length; i++) {
		   double raio = calculoCilindro[i];
		   double altura = calculoCilindro[i];
		   double volumeCilindro = 3.14 * Math.pow(raio,2) * altura;
           System.out.println("Volume do Cilindro com raio " + raio + " e altura " + altura + ": " + volumeCilindro);
	   }
   }
}
