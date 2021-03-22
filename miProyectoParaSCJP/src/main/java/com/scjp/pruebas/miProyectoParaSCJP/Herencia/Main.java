package com.scjp.pruebas.miProyectoParaSCJP.Herencia;

public class Main {
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
