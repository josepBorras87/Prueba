package com.scjp.pruebas.miProyectoParaSCJP.Clases;

public class H extends P{
	static {
        System.out.println(2);
    } 
 
    {
        System.out.println(6);
    } 
 
    H() {
        System.out.println(7);
    } 
 
    public static void main(String[] args) {
        System.out.println(3);
 
        new H();
//Al cargar la clase se ejutará el bloque estático del padre y luego el del hijo.
//Después se ejecuta el método main, y en este caso, lo primero que hace es escribir un 3.
// Después, al hacer new del hijo se llamará al bloque no estático del padre y luego a su constructor.
// Y por último, al bloque no estático del hijo y a su constructor.
 
}
}
