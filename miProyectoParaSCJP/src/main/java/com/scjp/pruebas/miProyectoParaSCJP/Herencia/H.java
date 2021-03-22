package com.scjp.pruebas.miProyectoParaSCJP.Herencia;

public class H extends P {
	// crear un atributo estático que se llame
	// igual que un atributo de instancia del
	// padre NO da error.
	    static String a = "a_hijo"; // OK
	    String a2 = "a2_hijo";
	 
	// crear un atributo estático que se llame
	// igual que un atributo estático
	// del padre NO da error.
	    static String b = "b_hijo"; // OK
	 
	// crear un método estático que se llame igual
	// que un método de instancia del padre
	// DA ERROR de compilación!
	// static void m(){}
	// crear un método estático que se llame igual
	// que un método estático del padre
	// NO da error y a eso se le llama redefinir 
	// el método.
	    static void m2() {
	    } // Ok
	 
	    void accediendo() {
	        System.out.println("Atributo de instancia a " +
	    " de P: " + super.a);
	// a_padre
	 
	        System.out.println("Atributo de clase a" +
	        " de H: " + a);
	// a_hijo
	 
	        System.out.println("Atributo de clase a2 " +
	        " de P: " + super.a2);
	// a2_padre
	 
	        System.out.println("Atributo de instancia a2" +
	        " de H: " + a2);
	// a2_hijo
	 
	        System.out.println("Atributo de clase b" +
	        " de P : " + super.b);
	// b_padre
	 
	        System.out.println("Atributo de clase b" + 
	        " de H: " + b);
	// b_hijo
	    }
	 
	    public static void main(String[] args) {
	        new H().accediendo();
	        System.out.println(new N().a); //a_hijo
	// Mostrará el valor del atributo estático a
	// de la clase H.
	// El objeto de N no puede acceder
	// al atributo de instancia a de la clase P.
	        P.m2();// metodo static m2 de P
	        H.m2();// metodo static m2 de H
	        N.m2();// metodo static m2 de H
	 
	    }
	 
	}