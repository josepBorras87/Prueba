package com.scjp.pruebas.miProyectoParaSCJP.PruebaCliente;

import java.util.List;

public interface Clientable {
	
	List<DatosCliente> recuperarLista() throws MiPersonalException;
	
	DatosCliente recuperarCliente(Integer codCliente) throws MiPersonalException;
	
	void actualizarDatosCliente(DatosCliente cliente) throws MiPersonalException;
	
	void borrarDatosCliente(Integer idCliente) throws MiPersonalException;
}
