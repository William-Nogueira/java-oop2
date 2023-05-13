package com.jovemprogramador.metodosestaticos;

public class Contador {

	private static int contador;
	
	Contador(){
		contador++;
	}
	
	public static void zerar() {
		contador = 0;
	}
	
	public static void incrementar() {
		contador++;
	}
	
	public static int retornar() {
		return contador;
	}
	
}
