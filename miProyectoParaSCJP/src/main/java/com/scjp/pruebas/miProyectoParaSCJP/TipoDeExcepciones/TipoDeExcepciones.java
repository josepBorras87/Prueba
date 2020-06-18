package com.scjp.pruebas.miProyectoParaSCJP.TipoDeExcepciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import com.scjp.pruebas.miProyectoParaSCJP.PruebaCliente.DatosCliente;

public class TipoDeExcepciones {

	public static void main(String[] args) {

		
		//tipoErrorArithmeticException(0);
		//tipoErrorArrayIndexOutOfBounsException();
		//tipoErrorClassCastException();
		//tipoErrorIllegalArgumentException ();
		

	}

	/*
	 *  ArithmeticException:
	 *  	Este error es lanzado cuando ha ocurrido una condición aritmética excepcional.
	 *  	Por ejemplo, "dividir por cero".
	 */
	private static void tipoErrorArithmeticException(int i) {
		Random rand = new Random(); //Intancia de la clase Random
		
		int marcoDeValores = 100; //Genera valores random entre 0-100
		
		int valorRandom = rand.nextInt(marcoDeValores);  //Generamos un valor random dentro del marcoValores
		
		System.out.println(valorRandom/i);
		
	}

	/*
	 *  ArrayIndexOutOfBoundsException:
	 *  	Error lanzado para indicar que se ha accedido a una matriz con un índice ilegal. 
	 *  	El índice es negativo o mayor o igual que el tamaño de la matriz.
	 */
	private static void tipoErrorArrayIndexOutOfBounsException() {
		int[] a = new int[5];
		
		a[5] = 1;
		
	}
	
	/*
	 *  ClassCastException:
	 * 		Este error es lanzado para indicar que el código ha intentado lanzar un objeto a una subclase 
	 * 		de la que no es una instancia.
	 * 
	 */
	private static void tipoErrorClassCastException() {
		try {
			Object x = new String ("Texto");
			System.out.println( (Integer)x );
		} catch (ClassCastException e){
			e.printStackTrace();
		} 
		
		List<Integer> lista = new ArrayList<Integer>();
		
		System.out.println(lista.isEmpty());
		
		lista.add(0);
		lista.add(1);
		
		Iterator<Integer> ite = lista.iterator();
		
		while(ite.hasNext()) {
			Integer iteger = (Integer) ite.next();
		}
		
		
		
	}
	
	/*
	 *  IllegalArgumentException:
	 *  	Error lanzado para indicar que un método ha pasado un argumento ilegal o inapropiado.
	 *   	Ejemplo, 
	 */
	private static void tipoErrorIllegalArgumentException() {
		DatosCliente cliente1 = new DatosCliente();

		
	}



}
