 public class Cotizador {
 	public static void main (String [] args) {

 		//Declaración de variables con información del cliente
 		String cliente1 = "Robbie Valentino";
 		char clasificacionCliente1= 'E';
 		int prestamoCliente1 = 12899;

 		//Declaración de variables con características del prestamo
 		double tasaAnual = 0.15;
 		int plazoMeses = 21;
 		double plazoAnios = plazoMeses / 12.0;

 		//Declaración de varicables con información del pago
 		double interes = prestamoCliente1 * tasaAnual * plazoAnios;
 		double totalAPagar = prestamoCliente1 + interes;
 		double mensualidad = totalAPagar / 12.0;
 		
 		//Salida de la información del cliente
 		System.out.println("=== Datos del cliente ===");
 		System.out.printf("Cliente : %s\nClasificación : %c\n", cliente1, clasificacionCliente1);
 		
 		//Salida con la información del prestamo
 		System.out.println("\n=== Características del prestamo ===");
 		System.out.printf("Prestamo : %d\nTasa anual : %.2f\nPlazo de : %d meses\n", prestamoCliente1, tasaAnual, plazoMeses );

 		//Salida de la información del pago
 		System.out.println("\n=== Información del pago ===");
 		System.out.printf("Pago de interéses : %.2f\nTotal : %.2f\nPago mensual  : %.2f\n", interes, totalAPagar, mensualidad);
 	}
 }