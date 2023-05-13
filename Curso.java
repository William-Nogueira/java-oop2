package com.jovemprogramador.metodosestaticos;

public class Curso {
	
	private String nome;
	private String horario;
	private Professor professor;
	private Aluno[] alunos;

	public Curso(String nome, String horario, Professor professor, Aluno[] alunos) {
		this.nome = nome;
		this.horario = horario;
		this.professor = professor;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public String getHorario() {
		return horario;
	}

	public Professor getProfessor() {
		return professor;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}
}
