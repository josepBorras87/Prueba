package com.scjp.pruebas.miProyectoParaSCJP.PruebaCliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ClientableImpl implements Clientable {

	@Override
	public List<DatosCliente> recuperarLista() throws MiPersonalException {
		Map<Integer, DatosCliente> mapaClientes = BBDDClientes.recuperarBBDDClientes();

		// Pasarlo a un List y retornarlo.
		List<DatosCliente> list = new ArrayList<DatosCliente>(mapaClientes.values());
		System.out.println(list);
		return list;
	}

	@Override
	public DatosCliente recuperarCliente(Integer codCliente) throws MiPersonalException {
		// 1. Validar que el código de cliente exista en base de datos.
		validarId(codCliente);

		DatosCliente clienteConsultado = null;
		// 2. Si existe recuperas el codigo de cliente y lo devuelves.
		List<DatosCliente> listaDeClientes = recuperarLista();

		for (DatosCliente cliente : listaDeClientes) {
			if (codCliente == cliente.getIdCliente()) {
				clienteConsultado = cliente;
				break;
			}
		}

		System.out.println(clienteConsultado);
		return clienteConsultado;

	}

	@Override
	public void actualizarDatosCliente(DatosCliente cliente) throws MiPersonalException {

		validarId(cliente.getIdCliente());

		BBDDClientes.recuperarBBDDClientes().put(cliente.getIdCliente(), cliente);

		System.out.println(BBDDClientes.recuperarBBDDClientes());

	}

	@Override
	public void borrarDatosCliente(Integer idCliente) throws MiPersonalException {
		validarId(idCliente);

		BBDDClientes.recuperarBBDDClientes().remove(idCliente);
		
		System.out.println(BBDDClientes.recuperarBBDDClientes());

	}

	private void validarId(Integer codCliente) throws MiPersonalException {
		boolean existeId = false;

		List<DatosCliente> listaDeClientes = recuperarLista();

		for (DatosCliente datosCliente : listaDeClientes) {
			if (codCliente == datosCliente.getIdCliente()) {
				existeId = true;
				break;
			}
		}

		if (!existeId) {
			throw new MiPersonalException("No se ha encontrado el cliente consultado.");
		}

	}

}
