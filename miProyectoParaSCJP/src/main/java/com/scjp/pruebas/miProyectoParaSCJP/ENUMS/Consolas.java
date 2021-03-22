package com.scjp.pruebas.miProyectoParaSCJP.ENUMS;

public enum Consolas {
	PS4(400),
	XBOX(350),
	PC(1000),
	MOBILE(200);
	
	private int precio;
	
	Consolas(int x){
		precio = x;	
	}
	
	public int getPrecio(){
		return precio;
	}
}
