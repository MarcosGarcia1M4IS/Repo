package Sistematico2_1;

public class FacturaLic extends Ventas{

	public FacturaLic(double precio, int cantidad, String lav, String plancha, String licuadora, int opc) {
		super(precio, cantidad, lav, plancha, licuadora, opc);
		// TODO Auto-generated constructor stub
	}
	public void leerDatos() {
		System.out.println("Ingrese el precio de la licuadora: ");	
		precio = tc.nextInt();
		System.out.println("Ingrese la cantidad a comprar: ");
		cantidad = tc.nextInt();
		
		if(precio <= 0 || cantidad<= 0) {
			System.out.println("El precio o la cantidad no pueder menores o iguales a cero");
		}
		
		}
		
		public void factura() {
			if(precio > 0 && cantidad > 0) {
				double total = precio * cantidad;
			System.out.println("*******************Factura*******************");
			System.out.println("*******Articulo: Lavadora********************");
			System.out.println("*********************************************");	
			System.out.println("Precio: CS" + precio);
		    System.out.println("Cantidad: "+ cantidad);
		    System.out.println("Total a pagar: C$" + total);
		    System.out.println("*********************************************");
			}
			
		}
}
