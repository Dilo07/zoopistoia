package zoopistoia_API.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zoopistoia_API.Model.Animale;
import zoopistoia_API.Repository.AnimaliRepository;


@Service
public class AnimaliService {
	
	@Autowired
	public AnimaliRepository animaliRepository;

	public List<Animale> getAllAnimali() {
		return animaliRepository.findAll();
	}
	
//	public List<Animale> getAllAnimali(Integer recinzioneId) {
//		return animaliRepository.findByRecinzioneId(recinzioneId);
//	}
	

	public boolean addUpdateAnimale(Animale animale) {
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
				animaliRepository.deleteById(id);
				return true;
		}
		catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}

}
