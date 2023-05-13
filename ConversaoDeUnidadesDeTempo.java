package com.jovemprogramador.metodosestaticos;

public class ConversaoDeUnidadesDeTempo {
    
    public static double segundosParaMinutos(double segundos) {
        return segundos / 60;
    }
    
    public static double minutosParaHoras(double minutos) {
        return minutos / 60;
    }
    
    public static double horasParaDias(double horas) {
        return horas / 24;
    }
    
    public static double diasParaSemanas(double dias) {
        return dias / 7;
    }
    
    public static double diasParaMeses(double dias) {
        return dias / 30;
    }
    
    public static double diasParaAnos(double dias) {
        return dias / 365.25;
    }
}