package com.jovemprogramador.metodosestaticos;

import java.util.Scanner;

public class TesteCurso {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o nome do curso: ");
		String nomeCurso = scan.nextLine();
		System.out.println("Digite o horario do curso: ");
		String horaCurso = scan.nextLine();
		
		System.out.println("Digite o nome do professor: ");
		String nomeProfessor = scan.nextLine();
		System.out.println("Digite o departamento do professor: ");
		String departamentoProfessor = scan.nextLine();
		System.out.println("Digite o email do professor: ");
		String emailProfessor = scan.nextLine();

		Professor professor = new Professor(nomeProfessor, departamentoProfessor, emailProfessor);

		System.out.println("Digite o nome do primeiro aluno: ");
		String primeiroAluno = scan.nextLine();
		System.out.println("Digite o nome do segundo aluno: ");
		String segundoAluno = scan.nextLine();
		System.out.println("Digite o nome do terceiro aluno: ");
		String terceiroAluno = scan.nextLine();
		System.out.println("Digite o nome do quarto aluno: ");
		String quartoAluno = scan.nextLine();
		System.out.println("Digite o nome do quinto aluno: ");
		String quintoAluno = scan.nextLine();
		
		Aluno[] alunos = new Aluno[5];
		alunos[0] = new Aluno(primeiroAluno);
		alunos[1] = new Aluno(segundoAluno);
		alunos[2] = new Aluno(terceiroAluno);
		alunos[3] = new Aluno(quartoAluno);
		alunos[4] = new Aluno(quintoAluno);

		Curso curso = new Curso(nomeCurso, horaCurso, professor, alunos);
		
		System.out.println("Bem vindo ao curso " + curso.getNome() + "!");
		System.out.println("Horario do curso: " + curso.getHorario() + ".");
		System.out.println("Professor(a): " + professor.getNome() + ".");
		System.out.println("Alunos: ");
		for (int i = 0; i < alunos.length; i++) {
			Aluno aluno = alunos[i];
			System.out.println(aluno.getNome());
		}
		
		System.out.println(" ");
		
		System.out.println("Digite a nota dos alunos: ");

		for (int i = 0; i < alunos.length; i++) {
			Aluno aluno = alunos[i];
			System.out.println("Aluno " + aluno.getNome() + ":");
			for (int j = 0; j < 4; j++) {
				System.out.print("Nota " + (j + 1) + ": ");
				aluno.getNotas()[j] = scan.nextDouble();
			}
		}

		for (int i = 0; i < alunos.length; i++) {
			Aluno aluno = alunos[i];
			System.out.println(" ");
			System.out.println("Nome do aluno: " + aluno.getNome());
			System.out.println("Media do aluno: " + aluno.getMedia());

			if (aluno.aprovado(aluno.getMedia())) {
				System.out.println("O aluno foi aprovado!");
			} else {
				System.out.println("O aluno nao foi aprovado.");
			}
		}

		scan.close();
	}
}
