package com.example.demo.Dipendenti;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Dipendenti")
public class DipendentiController {
	
	@Autowired
	private DipendentiService dipendentiservice;

	// chiama il metodo newdipendente che deve ritornare una lista di oggetti della classe Dipendente
	@RequestMapping("/getall")
	public List<Dipendente> getDipendenti() {
		return this.dipendentiservice.getAllDipendenti();
	}
	
	// chiama il metodo getdipendente ed in pase al nome passato nell'url, mostra il json dell'oggetto con quel nome
	@RequestMapping("/getdipendente/{nome}")
	public Dipendente getDipendente(@PathVariable String nome) {
		return this.dipendentiservice.getDipendente(nome);
	}
	
	//metodo per aggiungere un dipendente, verrà aggiunto un json nel corso nella richiesta, cone le informazioni.
	@RequestMapping(method=RequestMethod.POST, value="/newdipendente")
	public void addDipendente(@RequestBody Dipendente dipendente) {
		this.dipendentiservice.addDipendente(dipendente);
	}
	
	//metodo per aggiornare il dipendente che ha il nome uguale a quello passato nell'url
	@RequestMapping(method=RequestMethod.PUT, value="/updatedipendente/{nome}")
	public void updateDipendente(@RequestBody Dipendente dipendente,@PathVariable String nome) {
		this.dipendentiservice.updateDipendente(dipendente, nome);
	}
	
	//metodo per eliminared il dipendente che ha il nome uguale a quello passato nell'url
	@RequestMapping(method=RequestMethod.DELETE, value="/deletedipendente/{nome}")
	public void deleteDipendente(@PathVariable String nome) {
		this.dipendentiservice.deleteDipendente(nome);
	}
	
}
