package com.scjp.pruebas.miProyectoParaSCJP.PruebaCliente;

public class DatosCliente {

	public DatosCliente(int idCliente, String nombre, int edad, String direccion) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
	}

	private int idCliente;
	private String nombre;
	private int edad;
	private String direccion;
	
	
	public DatosCliente() {}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public String toString() {
		return "DatosCliente [idCliente=" + idCliente + ", nombre=" + nombre + ", edad=" + edad + ", direccion="
				+ direccion + "]";
	}

	
	
}
