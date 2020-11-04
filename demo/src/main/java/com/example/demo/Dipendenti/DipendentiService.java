package com.example.demo.Dipendenti;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DipendentiService {
	
	private List<Dipendente> dipendenti = Arrays.asList(
			new Dipendente("Andrea","Di Lorenzo"),
			new Dipendente("Marco","Di Lorenzo"),
			new Dipendente("Cristina","Di Lorenzo"));
	
	public List<Dipendente> getalldipendenti(){
		return dipendenti;
	}
	

}
