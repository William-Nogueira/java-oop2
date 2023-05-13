package com.jovemprogramador.metodosestaticos;

public class Calculadora {
	
	Calculadora(){
	}
	
	public double somar(double x, double y) {
		return x + y;
	}
	
	public double subtrair(double x, double y) {
		return x - y;
	}
	
	public double multiplicar(double x, double y) {
		return x * y;
	}
	
	public double dividir(double x, double y) {
		if (y == 0) {
			System.out.println("Erro!");
			return 0;
		} else {
			return (x / y);
		}
	}
	
	public double potencia(double x, double y) {
		return Math.pow(x, y);
	}
	
}
