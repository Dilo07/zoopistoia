package com.example.demo.Dipendenti;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DipendentiService {
	

//	@Autowired
//	private DipendentiRepository dipendentiRepository;
	
// crea una lista chiamata dipendenti di oggetti della classe Dipendente, 
//		richiamando il costruttore della classe Dipendente
//		private List<Dipendente> dipendenti = new ArrayList<>( Arrays.asList(
//				new Dipendente("Andrea","Di Lorenzo"),
//				new Dipendente("Marco","Di Lorenzo"),
//				new Dipendente("Cristina","Di Lorenzo")));
	
	private List<Dipendente> dipendenti = new ArrayList<>();
	
	public List<Dipendente> getAllDipendenti(){
//		dipendentiRepository.findAll().forEach(dipendenti::add);
		return dipendenti;
	}
	
	public Dipendente getDipendente(String nome) {
		// cerca in tutta la lista Dipendente e tramite in metodo getNome verifica se esiste un oggetto con il nome passato
		return dipendenti.stream().filter(t -> t.getNome().equals(nome)).findFirst().get();
	}
	
	public void addDipendente(Dipendente dipendente) {
		dipendenti.add(dipendente);
	}
	
	public void updateDipendente(Dipendente dipendente, String nome) {
		for(int i=0; i<dipendenti.size(); i++) {
			Dipendente d = dipendenti.get(i);
			if( d.getNome().equals(nome)) {
				dipendenti.set(i, dipendente);
				return;
			}
		}	
	}
	
	public void deleteDipendente(String nome) {
		for(int i=0; i<dipendenti.size(); i++) {
			Dipendente d = dipendenti.get(i);
			if( d.getNome().equals(nome)) {
				dipendenti.remove(i);
				return;
			}
		}
	}

}
