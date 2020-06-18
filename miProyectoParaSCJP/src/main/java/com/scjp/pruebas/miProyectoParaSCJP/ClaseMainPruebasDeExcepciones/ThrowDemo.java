package com.scjp.pruebas.miProyectoParaSCJP.ClaseMainPruebasDeExcepciones;

//Lanzar manualmente una excepción
public class ThrowDemo {
  public static void main(String[] args) {
      try{
          System.out.println("Antes de lanzar excepción.");
          throw new ArithmeticException(); //Lanzar una excepción
      }catch (ArithmeticException exc){
          //Capturando la excepción
          System.out.println("Excepción capturada.");
      }
      System.out.println("Después del bloque try/catch");
  }
}
