package com.example.demo.Dipendenti;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

public class Dipendente {
	private String nome;
	private String cognome;
	private String grado;
	private int id;
	
	public Dipendente(String nome){
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

//	@RequestMapping("/dipendenti")
//	@ResponseBody
//	public String dipendenti() {
//		return "dipendente 12";
//	}
	
}