package com.scjp.pruebas.miProyectoParaSCJP.CreacionClasesObjetos;

public class PruebasGenerales {

    public static void main(String[] args) {
        
        Persona persona1;
        
        persona1 = new Persona();
        
        persona1.desplegarNombres();
        
        persona1.nombre = "Juanito";
        persona1.apellido = "Valderrama";
        
        System.out.println("");
        persona1.desplegarNombres();
        
        Persona persona2 = new Persona();
        persona2.nombre = "Charo";
        persona2.apellido = "Ducados";
        
        System.out.println("");
        persona2.desplegarNombres();
        
       //Creamos un objeto de tipo aritmetica
        Aritmetica aritmetica = new Aritmetica();
        
        int resultado = aritmetica.sumar(5, 3);
        
        System.out.println("resultado = " + resultado);
        
    }
}
