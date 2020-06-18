package com.scjp.pruebas.miProyectoParaSCJP.PruebaCliente;

class Base extends Exception {}
class Derived extends Base  {}
 
public class Main {
  public static void main(String args[]) throws Derived {
   // some other stuff
   try {
       // Some monitored code
       throw new Derived();
    }
    catch(Base b)     { 
       System.out.println("Caught base class exception"); 
    }
  }
}
