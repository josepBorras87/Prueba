package com.scjp.pruebas.miProyectoParaSCJP.Herencia_2;

import java.util.ArrayList;
import java.util.List;

public class Padre {
	public void hacer() {
		System.out.println("El padre ejecuta hacer");
	}
	
	public List<String> recuperarLista() {
		return new ArrayList<String>();
	}
	
	protected void comprobarProteccion() {
		System.out.println("Has accedido");
	}
}
