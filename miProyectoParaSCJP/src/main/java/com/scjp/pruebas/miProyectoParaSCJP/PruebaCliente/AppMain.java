package com.scjp.pruebas.miProyectoParaSCJP.PruebaCliente;

public class AppMain {

	public static void main(String[] args) {
		//0.Crear una instancia de clienteable.
		Clientable cliente = new ClientableImpl();
		
		
		try {
			
			cliente.recuperarLista();
			
			DatosCliente clientConsultado = cliente.recuperarCliente(2);
			
			clientConsultado.setNombre("Francisco");
			clientConsultado.setDireccion("Calle Piruleta");
			clientConsultado.setEdad(55);
			
			cliente.actualizarDatosCliente(clientConsultado);
			
			cliente.borrarDatosCliente(3);
			
			
			
			
		} catch (MiPersonalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//1. Imprimir todos los datos del cliente por paantalla.
		//2. Borrar un registro y comprobar que este borrado.
		//3. Actualizar un registro y mostrar los datos actualizados.
		//4. Recuperar un cliente a partir de si id.
		

	}

}
