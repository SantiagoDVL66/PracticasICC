 public class EstimacionPi {
 	public static void main (String [] args) {
 		//variables declaradas
 		int dardosLan = 1000000;
 		int contadorDar = 0;
 		double aproxPi = 0;
 		int dardosDen = 0;
 		double dardosX = 0;
 		double dardosY = 0;

 		//ciclo de los dardos 
 		while (contadorDar < dardosLan) {
 			//Cordenadas de los dardos
 			dardosX = Math.random();
 			dardosY = Math.random();
 			//cuenta dardos dentro del circulo
 			if (Math.pow(dardosX,2) + Math.pow(dardosY,2) <= 1) {
 				dardosDen++; 
 			}
 			//contador de dardos lanzados
 			contadorDar++; 
 		}
 		//cast explicito necesario por perdida de datos
 		double aproxPi = (4 * ((double)dardosDen/(double)dardosLan));

 		//la impresion de los resultados solicitados
 		System.out.println("Dardos Lanzados: " + dardosLan);
 		System.out.println("Dardos que cayerón dentro: " + dardosDen);
 		System.out.printf("Pi es aproximadamente: %.6f\n", aproxPi);


 	} 
 }