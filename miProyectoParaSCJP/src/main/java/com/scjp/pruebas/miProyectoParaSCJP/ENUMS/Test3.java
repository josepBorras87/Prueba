package com.scjp.pruebas.miProyectoParaSCJP.ENUMS;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("El precio de la play es: " + Consolas.PS4.getPrecio());
		
		for(Consolas consola : Consolas.values()) {
			System.out.println("Consola: " + consola + "||||  Precio: " + consola.getPrecio());
		}

	}

}
