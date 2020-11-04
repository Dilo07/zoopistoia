package com.example.demo.Dipendenti;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DipendentiController {
	
	@Autowired
	private DipendentiService dipendentiservice;

	@RequestMapping("/Dipendente")
	public List<Dipendente> newdipendenti() {
		return dipendentiservice.getalldipendenti();
	}
	
	@RequestMapping("/Dipendente/{nome}")
	public Dipendente getdipendente(@PathVariable String nome) {
		return dipendentiservice.getdipendente(nome);
	}
	
}
