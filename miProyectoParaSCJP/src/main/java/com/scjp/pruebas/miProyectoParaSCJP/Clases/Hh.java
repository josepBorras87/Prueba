package com.scjp.pruebas.miProyectoParaSCJP.Clases;

public class Hh extends Pp {
    static String nombre = "Ludovico Einaudi";
    static {
        System.out.println("13. Esto se cargará por ser una clase anidada de la principal.");
    }
    {
        System.out.println("14. No le llaman.");
    }
}
