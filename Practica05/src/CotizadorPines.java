 public class CotizadorPines {
 	public static void main (String [] args) {

 		//Declaración de variables con información del cliente
 		String cliente1 = "Robbie Valentino";
 		char clasificacionCliente1= 'E';
 		int checkC = 0;

 		/*
 		E: estandar
		P: preferente 
		R: riesgozo
		*/
		//Reviza clasificación cliente
 		if(clasificacionCliente1 != 'E' && clasificacionCliente1 != 'P' && clasificacionCliente1 != 'R') {
 			System.out.println("Cliente mal clasificado.");
 		} else{
 			 		//Salida de la información del cliente
 		System.out.println("=== Datos del cliente ===");
 		System.out.printf("Cliente : %s\nClasificación : %c\n", cliente1, clasificacionCliente1);
 		checkC ++;
 		}

 		//Declaración de variables con características del prestamo
 		double tasaAnual = 0.15;
 		int plazoMeses = 21;
 		double plazoAnios = plazoMeses / 12.0;
 		int prestamoCliente1 = 12899;
 		int checkP = 0;

 		//Reviza el plazo
 		if(plazoMeses < 0 || plazoAnios < 0){
 			System.out.println("El plazo de los meses esta mal declarado");
 		} else {
 			checkP ++;
 		}

 		//Reviza la tasa anual
 		if((tasaAnual * 100) != 15) {
 			System.out.println("La tasa anual declarada no coincide con la aplicada");
 		} else {
 			checkP ++;
 		}

 		//Reviza el prestamo
 		if(prestamoCliente1 < 0) {
 			System.out.println("El prestamo esta mal declarado");
 		} else {
 			checkP ++;
 		}

 			//Impacto de la clasificación
 		if(clasificacionCliente1 == 'P') {
 			tasaAnual -= 0.02;
 		} else if(clasificacionCliente1 == 'E') {
 			tasaAnual += 0;
 		} else {
 			tasaAnual += 0.03;
 		}

 		if(checkP == 3) {
 			 		//Salida con la información del prestamo
 		System.out.println("\n=== Características del prestamo ===");
 		System.out.printf("Prestamo : %d\nTasa anual : %.2f\nPlazo de : %d meses\n", prestamoCliente1, tasaAnual, plazoMeses );
 		}

 		

 		//Declaración de varicables con información del pago
 		double interesSimple = prestamoCliente1 * tasaAnual * plazoAnios;
 		double totalAPagarSimple = prestamoCliente1 + interesSimple;
 		double mensualidad = totalAPagarSimple / 12.0;
 		double tasaMensual = tasaAnual / 12;
 		double deuda = prestamoCliente1;
 		

 		

 		if(checkP == 3 && checkC == 1) {
 		//Salida de la información del pago, interes simple
 		System.out.println("\n=== Información del pago ===");
 		System.out.printf("Pago de interéses simple : %.2f\nTotal simple : %.2f\nPago mensual simple : %.2f\n", 
 			interesSimple, totalAPagarSimple, mensualidad);
 		}

 		System.out.println("=== Interes compuesto ===");

 		//calculo con ciclo del interes compuesto
 		for(int mesPlazo = 1;mesPlazo < 22 ;mesPlazo ++ ){
 			deuda = deuda * (1 + tasaMensual);
 			System.out.printf("En el mes %d debes pagar: %.2f \n",mesPlazo, deuda);
 		}
 		
 		//Interes compuesto y total compuesto
 		double interesCompuesto = deuda - prestamoCliente1;
 		double totalCompuesto = prestamoCliente1 * Math.pow((1 + tasaMensual),plazoMeses);
 		
 		if(checkP == 3 && checkC == 1) {
 		//Salida de la información del pago, interes compuesto
 		System.out.printf("El total a pagar de interés compuesto es: %.2f\nTotal compuesto: %.2f\n",
 			interesCompuesto, totalCompuesto);
 		}
 	}


 }