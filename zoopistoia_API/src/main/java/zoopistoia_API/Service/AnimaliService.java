package zoopistoia_API.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zoopistoia_API.Model.Animale;
import zoopistoia_API.Model.Recinzione;
import zoopistoia_API.Repository.AnimaliRepository;
import zoopistoia_API.Repository.RecinzioniRepository;


@Service
public class AnimaliService {
	
	@Autowired
	public AnimaliRepository animaliRepository;
	@Autowired
	public RecinzioniRepository recinzioniRepository;

	public List<Animale> getAllAnimali() {
		return animaliRepository.findAll();
	}
	
//	public List<Animale> getAllAnimali(Integer recinzioneId) {
//		return animaliRepository.findByRecinzioneId(recinzioneId);
//	}
	

	public boolean addAnimale(Animale animale) {
			Recinzione rec = animale.getRecinzione();
			Recinzione dbrec = recinzioniRepository.getOne(rec.getId());			
			
			if (recinzioniRepository.existsById(rec.getId()) && dbrec.getDisponibilità()>0) {
				animaliRepository.save(animale);
				dbrec.setDisponibilità(dbrec.getDisponibilità()-1);
				recinzioniRepository.save(dbrec);
				return true;
			}
			else
			{
				Exception e = new Exception();
				System.out.println(e);
				return false;
			}
	}
	
	public boolean UpdateAnimale(Animale animale) {
		try {
			animaliRepository.save(animale);
			return true;
		}
		catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public boolean deleteAnimale(Integer id) {
		try {
 		// creo una variablie Animale associando l'oggetto con l'id passato e creo una variabile recinzione passandogli l'id della chiave esterna recinzione
			Animale an = animaliRepository.getOne(id);
			Recinzione rec = an.getRecinzione();
			rec.setDisponibilità(rec.getDisponibilità() + 1);
			recinzioniRepository.save(rec);
			animaliRepository.deleteById(id);
			return true;
		}
		catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public List<Animale> getAnimaliInRecizione(Integer id) {
		return animaliRepository.getAnimaliInRecizione(id);
	}

}
