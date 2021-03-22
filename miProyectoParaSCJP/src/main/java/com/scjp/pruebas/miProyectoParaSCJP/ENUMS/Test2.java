package com.scjp.pruebas.miProyectoParaSCJP.ENUMS;

public class Test2 {
	public static void main(String... args) {
		Color colores[] = Color.values();
		
		for(Color color : colores) {
			
			if(color.equals(Color.AMARILLO)) {
				
				System.out.println(color);
			}
		}
		
		Color color2 = Color.valueOf("AMARILLO");
		System.out.println(color2);
		
	}
}
