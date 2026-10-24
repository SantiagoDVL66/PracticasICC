 public class PrecisionPi {
 	public static void main (String [] args) {

 		//declaración de variables
 		double tolerancia = 0.001;
 		double errorEstimacion = 0;
 		double contadorDar = 0;
 		double dardosDen = 0;
 		double dardosX = 0;
 		double dardosY = 0;
 		double aproxPi = 0;

		errorEstimacion = Math.abs(aproxPi - Math.PI);

 		//ciclo de dardos 
 		while (errorEstimacion >= tolerancia) {
 			
 			//Cordenadas de los dardos
 			dardosX = Math.random();
 			dardosY = Math.random();
 			
 			//dardos dentro circulo
 			if (Math.pow(dardosX,2) + Math.pow(dardosY,2) <= 1) {
 				dardosDen++; 
 			}

 			//estimacion final
 			contadorDar ++;
 			aproxPi = (4 * (dardosDen/contadorDar));
 			errorEstimacion = Math.abs(aproxPi - Math.PI);	
 		}
 		

 		System.out.println("Dardos usados: " + contadorDar);
 		System.out.printf("Estimación fianl: %.6f\n", aproxPi);
 	}
 }