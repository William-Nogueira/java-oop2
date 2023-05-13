package com.jovemprogramador.metodosestaticos;

public class TesteContador {

	public static void main(String[] args) {
		
		Contador.zerar();
		Contador.incrementar();
		Contador.incrementar();
		
		System.out.println(Contador.retornar()); 

	}

}
