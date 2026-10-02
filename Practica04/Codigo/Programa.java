public class Programa{	
	public static void main(String[] args) {
	//Lo que se quiere comprar
	String producto = "Laptop para la carrera";
	//El precio original del producto
	int precio = 15000;
	//El valor del descuento
	int descuento = 3000;
	//El intervalo en el que se pagará
	double meses = 18.0;

	//Etiqueta del codigo
	System.out.println("=== Ficha de compra ===");
	//Esta línea imprime que producto se va a comprar
	System.out.println("- Producto : " + producto);
	//Esta línea imprime el valor real del producto (es decir despues de restar el descuento)
	System.out.println("- Precio con descuento : " + (precio - descuento));
	//Esta línea convierte el intervalo de paga a años
	System.out.println("- Plazo de pago en anios : " + (meses / 12.0));
	//Esta línea imprime cuanto se va a pagar cada mes
	System.out.println("- Pago mensual : " + ((precio - descuento) / meses));
	//Esta línea imprime un indicativo de que termina la ficha
	System.out.println("=== Fin de la ficha ===");


	}
}