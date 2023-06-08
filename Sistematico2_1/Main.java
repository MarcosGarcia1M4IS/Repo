package Sistematico2_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		Factura faLa = new Factura(0, 0, null, null, null, 0); 
		FacturaPlancha Fp = new FacturaPlancha(0, 0, null, null, null, 0);
		FacturaLic Fl = new FacturaLic(0, 0, null, null, null, 0);
		
		
		int opc = 0;
		
		Scanner tc = new Scanner(System.in);
		while(opc != 4) {
			System.out.println("Ingrese que desea comprar");
			System.out.println("1.Lavadora");
			System.out.println("2.Plancha");
			System.out.println("3.Licuadora");
			System.out.println("4.Salir");
			opc = tc.nextInt();
			
			switch(opc) {
			case 1:
				faLa.leerDatos();
				faLa.factura();
				break;
				
			case 2:
				Fp.leerDatos();
				Fp.factura();
				break;
				
			case 3:
				Fl.leerDatos();
				Fl.factura();
				break;
				
			case 4: 
				System.out.println("Saliendo...");
				break;
			}
			
			
		}

		}catch(java.util.InputMismatchException jk ) {
			System.out.println("Error");
		}
	}
		
}
