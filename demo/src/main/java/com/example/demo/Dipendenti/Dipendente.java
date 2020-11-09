package com.example.demo.Dipendenti;

public class Dipendente {
	private String nome;
	private String cognome;
	private int id;
	
	public Dipendente(int id, String nome, String cognome){
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getNome() {
		return this.nome;
	}
	
	public String getCognome() {
		return this.cognome;
	}

	public int getId() {
		return id;
	}
		
}