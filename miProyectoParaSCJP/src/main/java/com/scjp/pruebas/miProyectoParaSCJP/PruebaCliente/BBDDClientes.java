package com.scjp.pruebas.miProyectoParaSCJP.PruebaCliente;

import java.util.HashMap;
import java.util.Map;

public class BBDDClientes {
	private static Map<Integer, DatosCliente> bbddClientes;
	
	static {
	
		DatosCliente cliente1 = new DatosCliente (1, "Pepe", 23, "Calle 1");
		DatosCliente cliente2 = new DatosCliente (2, "Juan", 35, "Calle 56");
		DatosCliente cliente3 = new DatosCliente (3, "Jaime", 13, "Calle 92");
		DatosCliente cliente4 = new DatosCliente (4, "Esther", 73, "Calle 65");
		
		bbddClientes = new HashMap<Integer, DatosCliente>();
		
		bbddClientes.put(cliente1.getIdCliente(), cliente1);
		bbddClientes.put(cliente2.getIdCliente(), cliente2);
		bbddClientes.put(cliente3.getIdCliente(), cliente3);
		bbddClientes.put(cliente4.getIdCliente(), cliente4);
	}
	
	static Map<Integer, DatosCliente> recuperarBBDDClientes() {
		return bbddClientes;
	}
}
