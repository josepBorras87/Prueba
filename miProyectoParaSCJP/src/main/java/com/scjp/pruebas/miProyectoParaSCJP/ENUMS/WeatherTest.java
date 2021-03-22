package com.scjp.pruebas.miProyectoParaSCJP.ENUMS;

public class WeatherTest {

	static Weather w;

	public static void main(String[] args) {

		System.out.print(w.RAINY.count + " " + w.Sunny.count + " ");
		int i = Weather.values().length;
		
		
	}

}

enum Weather {
	RAINY, Sunny;

	int count = 0;

	Weather() {
		System.out.print("c ");
		count++;
	}
}
