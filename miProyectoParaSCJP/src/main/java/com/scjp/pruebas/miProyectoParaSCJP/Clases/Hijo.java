package com.scjp.pruebas.miProyectoParaSCJP.Clases;

import com.scjp.pruebas.miProyectoParaSCJP.Herencia_2.Padre;

public class Hijo extends Padre{
	public void hacer() {
		System.out.println("El hijo ejecuta hacer.");
	}
	
	public static void main(String ...args) {
		Hijo hijo = new Hijo();
		hijo.test();
		
		Padre padre = new Padre();
		
		//recuperarLista();
		
		//Accede a traves de la instancia de una subclase
		hijo.comprobarProteccion();
		
		
		
		//No accede xq no lo hace a traces de una instancia de una subclase
		//padre.comprobarProteccion();
		
	}
	
	
	
	public void test() {
		hacer();
		this.hacer();
		super.hacer();
		
		this.recuperarLista();
		super.recuperarLista();
		recuperarLista();
		
		comprobarProteccion();
	}
}
