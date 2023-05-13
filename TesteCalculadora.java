package com.jovemprogramador.metodosestaticos;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		System.out.println(calculadora.somar(2, 3)); 
		System.out.println(calculadora.multiplicar(5, 5));
		System.out.println(calculadora.dividir(9, 2)); 
		System.out.println(calculadora.potencia(5, 4)); 
		
	}

}
