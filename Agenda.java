package com.jovemprogramador.metodosestaticos;

public class Agenda {
    private String nome;
    private Contato[] contatos = new Contato[10];
    private int contador = 0;

    public Agenda(String nome) {
        this.nome = nome;
    }

    public void adicionarContato(String nome, String telefone, String email) {
        Contato contato = new Contato(nome, telefone, email);
        contatos[contador] = contato;
        contador++;
    }

    public void mostarContatos() {
    	System.out.println("Contatos da agenda " + nome + " :");
        for (int i = 0; i < contador; i++) {
            Contato contato = contatos[i];
            System.out.println("Nome: " + contato.getNome() + ", Telefone: " + contato.getTelefone() + ", Email: " + contato.getEmail());
        }
    }
}
