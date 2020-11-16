package zoopistoia_API.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zoopistoia_API.Model.Dipendente;
import zoopistoia_API.Repository.DipendentiRepository;

@Service
public class DipendentiService {
	

	@Autowired
	private DipendentiRepository dipendentiRepository;
	
// crea una lista chiamata dipendenti di oggetti della classe Dipendente, 
//		richiamando il costruttore della classe Dipendente
//		private List<Dipendente> dipendenti = new ArrayList<>( Arrays.asList(
//				new Dipendente("Andrea","Di Lorenzo"),
//				new Dipendente("Marco","Di Lorenzo"),
//				new Dipendente("Cristina","Di Lorenzo")));
	
	//private List<Dipendente> dipendenti = new ArrayList<>();
	
	public List<Dipendente> getAllDipendenti(){
		// svuota la lista dipendenti salvata in RAM
		//dipendenti.clear();
		// scorre tutte le istanze di dipendentiRepository (Interfaccia JpaRepository <Dipendente, Integer>) e per ogni istanza popola la List dipendenti
		//dipendentiRepository.findAll().forEach(dipendenti::add);
		return dipendentiRepository.findAll();
//		dipendentiRepository.findAll().forEach((dip)->{
//			dipendenti.add(dip);
//		});
		//return dipendenti;
	}
	
	public Dipendente getDipendente(Integer id) {
		// cerca in tutta la lista Dipendente e tramite in metodo getNome verifica se esiste un oggetto con il nome passato
		//return dipendenti.stream().filter(t -> t.getNome().equals(nome)).findFirst().get();
		Optional <Dipendente> app = dipendentiRepository.findById(id);
		return app.isPresent() ? app.get():null;
	}
	
	public boolean addDipendente(Dipendente dipendente) {
		try {
				dipendentiRepository.save(dipendente);
				return true;				
		}
		catch(Exception e){
			System.out.println(e);
			return false;
		}
	}
	
	public boolean updateDipendente(Dipendente dipendente) {
//		for(int i=0; i<dipendenti.size(); i++) {
//			Dipendente d = dipendenti.get(i);
//			if( d.getNome().equals(nome)) {
//				dipendenti.set(i, dipendente);
//				return;
//			}
//		}	
		try {
			dipendentiRepository.save(dipendente);
			return true;
		}
		catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	public boolean deleteDipendente(Integer id) {
		try {
			dipendentiRepository.deleteById(id);
			return true;
		}
		catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}

}
