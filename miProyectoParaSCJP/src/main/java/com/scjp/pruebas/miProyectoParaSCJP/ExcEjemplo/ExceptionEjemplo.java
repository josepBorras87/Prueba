package com.scjp.pruebas.miProyectoParaSCJP.ExcEjemplo;

//Una excepción puede ser generada por un método
//y atrapada por otro
public class ExceptionEjemplo {
//Generando una exepción
 public static void genExcepcion(){
     int nums[]= new int[4];
     System.out.println("Antes de que se genere la excepción.");
     //generar una excepción de índice fuera de límites
     nums[7]=10;
     System.out.println("Esto no se mostrará.");
 }
}
