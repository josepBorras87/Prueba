package com.scjp.pruebas.miProyectoParaSCJP.ClaseMainPruebasDeExcepciones;

import com.scjp.pruebas.miProyectoParaSCJP.ExcEjemplo.Rethrow;

public class RethrowDemo {
    public static void main(String[] args) {
        try{
            Rethrow.genExcepcion();
        }
        catch (ArrayIndexOutOfBoundsException exc){
            //Recapturando la excepción
            System.out.println("ERROR - Programa terminado");
        }
    }
}
