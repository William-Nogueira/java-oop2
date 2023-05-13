package com.jovemprogramador.metodosestaticos;
import java.util.Random;

public class Aluno {
	
    private String nome;
    private int matricula;
    private double[] notas;
    Random random = new Random(); 
    
    public Aluno(String nome) {
        this.nome = nome;
        this.matricula = random.nextInt(1000);
        this.notas = new double[4];
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getMatricula() {
        return matricula;
    }
    
    public double[] getNotas() {
        return notas;
    }
    
    public double getMedia() {
        double somaMedias = 0;
        for (int i = 0; i < 4; i++) {
            somaMedias += notas[i];
        }
        return somaMedias/4;
    }
    
    public boolean aprovado(double media) {
    	if (media > 7) {
    		return true;
    	} else {
    		return false;
    	}
    }
}