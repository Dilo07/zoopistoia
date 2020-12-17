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
	
		//verifica se esiste l'id dipendente e l'id recinzione passati nel body
		if (dipendentiRepository.existsById(dip.getId())== true && recinzioniRepository.existsById(rec.getId())==true) {
			permessiRepository.save(permesso);
			return true;
		}
		else {
			Exception e = new Exception();
			System.out.println(e);
			return false;
		}
	}

	public void deletePermesso(Integer id) {
		permessiRepository.deleteById(id);
	}

}
