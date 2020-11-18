package zoopistoia_API.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import zoopistoia_API.Model.Animale;

@Repository
public interface AnimaliRepository extends JpaRepository<Animale, Integer>{
//	public List<Animale> findByRecinzioneId(Integer recinzioneId);

}
