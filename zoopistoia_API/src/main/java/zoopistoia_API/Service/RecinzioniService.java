package zoopistoia_API.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zoopistoia_API.Model.Recinzione;
import zoopistoia_API.Repository.RecinzioniRepository;


@Service
public class RecinzioniService {

	@Autowired
	public RecinzioniRepository recinzioniRepository;

	public List<Recinzione> getAllRecinzioni() {
		return recinzioniRepository.findAll();
	}

	public Recinzione getRecinzione(Integer id) {
		Optional <Recinzione> app = recinzioniRepository.findById(id);
		return app.isPresent() ? app.get():null;
	}
	
	public boolean addUpdateRecinzione(Recinzione recinzione) {
		try {
				recinzioniRepository.save(recinzione);
				return true;				
		}
		catch(Exception e){
			System.out.println(e);
			return false;
		}
	}

	public boolean deleteRecinzione(Integer id) {
			try {
				recinzioniRepository.deleteById(id);
				return true;				
		}
		catch(Exception e){
			System.out.println(e);
			return false;
		}
	}

//	public List<Recinzione> getPermessiDipendentiInRecinzione(Integer id) {
//		return recinzioniRepository.getPermessiDipendentiInRecizione(id);
//	}
}
