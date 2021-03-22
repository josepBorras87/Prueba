package com.scjp.pruebas.miProyectoParaSCJP.Clases;

public class Pp {
	static {
		System.out.println("8. Bloque de inicialización de clase.");
        System.out.println("8. Esto se cargará por ser una clase anidada de la principal.");
        System.out.println("8. Un bloque de inicialización estático se forma con la palabra reservada static y las llaves.");
    }
 
    {
        System.out.println("9. Bloque de inicialización de instancia.");
        System.out.println("9. Para hacer un bloque de inicialización de instancia sólo necesitamos poner las llaves.");
    }
}
