package zoopistoia_API.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import zoopistoia_API.Model.Dipendente;
import zoopistoia_API.Service.DipendentiService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/Dipendenti")
public class DipendentiController {
	
	@Autowired
	private DipendentiService dipendentiservice;

	// chiama il metodo newdipendente che deve ritornare una lista di oggetti della classe Dipendente
	@RequestMapping("/getAll")
	public List<Dipendente> getDipendenti() {
		return this.dipendentiservice.getAllDipendenti();
	}
	
	// chiama il metodo getdipendente ed in base all'id passato nell'url, mostra il json dell'oggetto con quel nome
	@RequestMapping("/getDipendente/{id}")
	public Dipendente getDipendente(@PathVariable Integer id) {
		return this.dipendentiservice.getDipendente(id);
	}
	
	//metodo per aggiungere un dipendente, verrà aggiunto un json nel corso nella richiesta, cone le informazioni.
	@RequestMapping(method=RequestMethod.POST, value="/newDipendente")
	public Integer addDipendente(@RequestBody Dipendente dipendente) {
		return this.dipendentiservice.addDipendente(dipendente);
	}
	
	//metodo per aggiornare il dipendente che ha il nome uguale a quello passato nell'url
	@RequestMapping(method=RequestMethod.PUT, value="/updateDipendente")
	public boolean updateDipendente(@RequestBody Dipendente dipendente) {
		return this.dipendentiservice.updateDipendente(dipendente);
	}
	
	//metodo per eliminared il dipendente che ha il nome uguale a quello passato nell'url
	@RequestMapping(method=RequestMethod.DELETE, value="/deleteDipendente/{id}")
	public boolean deleteDipendente(@PathVariable Integer id) {
		return this.dipendentiservice.deleteDipendente(id);
	}

}
