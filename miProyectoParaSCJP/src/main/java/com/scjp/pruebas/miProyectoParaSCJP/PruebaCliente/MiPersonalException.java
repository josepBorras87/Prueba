package com.scjp.pruebas.miProyectoParaSCJP.PruebaCliente;

public class MiPersonalException extends Exception{

		public MiPersonalException() {}
		
		public MiPersonalException(String mensaje) {
			super(mensaje);
		}
		
		public MiPersonalException(String mensaje, Throwable e) {
			super(mensaje, e);
		}
}
