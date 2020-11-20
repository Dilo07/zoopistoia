package zoopistoia_API.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zoopistoia_API.Model.Dipendente;
import zoopistoia_API.Model.Permesso;
import zoopistoia_API.Model.Recinzione;
import zoopistoia_API.Repository.DipendentiRepository;
import zoopistoia_API.Repository.PermessiRepository;
import zoopistoia_API.Repository.RecinzioniRepository;

@Service
public class PermessiService {
	
	@Autowired
	public PermessiRepository permessiRepository;
	@Autowired
	public DipendentiRepository dipendentiRepository;
	@Autowired
	public RecinzioniRepository recinzioniRepository;

	public List<Permesso> getAllPermessi() {
		return permessiRepository.findAll();
	}

	public boolean newPermesso(Permesso permesso) {
		Dipendente dip = permesso.getDipendente();
		Recinzione rec = permesso.getRecinzione();
//		System.out.println(dip.getId());
//		System.out.println(dipendentiRepository.getOne(dip.getId()));
//		Permesso app = permessiRepository.getOne(dip.getId());
//		Permesso app2 = permessiRepository.getOne(rec.getId());
//		System.out.println(app.getRecinzione());
		
		try {
			//verifico che l'id dipendente inserito esiste
			System.out.println(dipendentiRepository.getOne(dip.getId()));
			//verifico che l'id recinzione inserito esiste
			System.out.println(recinzioniRepository.getOne(rec.getId()));
			permessiRepository.save(permesso);
			return true;
		}
		catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public void deletePermesso(Integer id) {
		permessiRepository.deleteById(id);
	}

}
