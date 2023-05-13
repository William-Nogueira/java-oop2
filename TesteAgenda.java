package com.jovemprogramador.metodosestaticos;

import java.util.Scanner;

public class TesteAgenda {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o nome da agenda: ");
		String nomeAgenda = scan.nextLine();
		Agenda agenda = new Agenda(nomeAgenda);
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("Contato " + i + ":");
			System.out.print("Nome: ");
			String nome = scan.next();
			System.out.print("Telefone: ");
			String telefone = scan.next();
			System.out.print("Email: ");
			String email = scan.next();
			
			agenda.adicionarContato(nome, telefone, email);
		}
		
		agenda.mostarContatos();
		scan.close();
	}
}
