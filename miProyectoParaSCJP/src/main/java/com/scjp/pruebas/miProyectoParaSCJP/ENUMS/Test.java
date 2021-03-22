package com.scjp.pruebas.miProyectoParaSCJP.ENUMS;

//Una clase enum
enum Dia {
	LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;
}

//Controlador de clase que contiene un objeto de "día" y
//main().
public class Test {
	Dia dia;

	// Constructor
	public Test(Dia dia) {
		this.dia = dia;
	}

	// Imprime una línea sobre el DIA usando switch
	public void diaEs() {
		switch (dia) {
		case LUNES:
			System.out.println("Los lunes son feos.");
			break;
		case VIERNES:
			System.out.println("Los viernes son mejores.");
			break;
		case SABADO:
		case DOMINGO:
			System.out.println("Los fines de semana son mejores.");
			break;
		default:
			System.out.println("Los días entre semana son regulares.");
			break;
		}
	}

	// Metodo
	public static void main(String[] args) {
		String str = "LUNES";
		Test t1 = new Test(Dia.valueOf(str));
		System.out.println(t1);
		t1.diaEs();
	}
}
