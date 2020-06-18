package com.scjp.pruebas.miProyectoParaSCJP.CreacionClasesObjetos;

public class Aritmetica {
    
	public Aritmetica(){
        System.out.println("Ejecutando constructor vacio");
    }
	
    int a;
    int b;
    
    public Aritmetica(int arg1, int arg2){
        a = arg1;
        b = arg2;
        System.out.println("Ejecutando constructor con dos argumentos");
    }
	
	public int sumar(int a, int b){
        int resultado = a + b;
        return resultado;
    }
    
    public int sumar(){
        int resultado = a + b;
        return resultado;
    }
}
