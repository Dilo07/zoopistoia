package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dipendente {
	private String nome;
	private String cognome;
	private String grado;
	private int id;
	
	Dipendente(){}

	@RequestMapping("/dipendenti")
	@ResponseBody
	public String dipendenti() {
		return "dipendenti";
	}
	
}
