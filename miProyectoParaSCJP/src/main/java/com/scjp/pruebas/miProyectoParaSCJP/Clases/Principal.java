package com.scjp.pruebas.miProyectoParaSCJP.Clases;


public class Principal {
	
	{
	    System.out.println("Bloque de inicialización de instancia: no me llamaran");
	}
	
	static {
        System.out.println("1. Al cargarse la clase esto será lo 1º que se cargará.");
    }
	
    public static void main(String[] args) {
 
        System.out.println("2. Al ejecutar se cargará la clase y se ejecutarán todos sus elementos estáticos");
        
        System.out.println("3. Antes de crear Z.");
        
        Z z = new Z();
        
        System.out.println("5. Despues de crear Z.");
     
        System.out.println("6. Valor de Z: " + String.valueOf(z));
        
        
        
        System.out.println("7. Antes de crear Pp.");
        
        Pp pp = new Pp();
        
        System.out.println("10. Despues de crear Pp.");
        
        System.out.println("11. valor de pp: " + String.valueOf(pp));
        
        
        
        System.out.println("12. Antes de crear Hh.");
        
        Hh hh = new Hh();
        System.out.println("15. Despues de crear Hh.");
        
        System.out.println("16. valor de hh: " + String.valueOf(hh));


    }
}
