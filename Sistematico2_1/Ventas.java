package Sistematico2_1;

import java.util.Scanner;

public abstract class Ventas {

	public double precio, cantidad;
	public String lav, plancha, licuadora;
public int opc = 0;
public Ventas(double precio, int cantidad, String lav, String plancha, String licuadora, int opc) {
	super();
	this.precio = precio;
	this.cantidad = cantidad;
	this.lav = lav;
	this.plancha = plancha;
	this.licuadora = licuadora;
	this.opc = opc;
}	

	public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public double getCantidad() {
	return cantidad;
}
public void setCantidad(double cantidad) {
	this.cantidad = cantidad;
}
public String getLav() {
	return lav;
}
public void setLav(String lav) {
	this.lav = lav;
}
public String getPlancha() {
	return plancha;
}
public void setPlancha(String plancha) {
	this.plancha = plancha;
}
public String getLicuadora() {
	return licuadora;
}
public void setLicuadora(String licuadora) {
	this.licuadora = licuadora;
}
public int getOpc() {
	return opc;
}
public void setOpc(int opc) {
	this.opc = opc;
}
public Scanner getTc() {
	return tc;
}
public void setTc(Scanner tc) {
	this.tc = tc;
}

	Scanner tc = new Scanner(System.in);
	
	
	public void leerDatos() {
		
	}
	public abstract void factura();
	
	}
