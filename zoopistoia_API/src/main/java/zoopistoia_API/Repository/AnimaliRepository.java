package zoopistoia_API.Repository;


import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import zoopistoia_API.Model.Animale;


@Repository
public interface AnimaliRepository extends JpaRepository<Animale, Integer>{
	
	// Query per estrarre gli animali presenti in una recinzione passata in ingresso (id recinzione)
	@Transactional
	@Query("FROM Animale A, Recinzione R "
			+ "WHERE A.recinzione.id = R.id AND R.id = ?1")
	public List<Animale> getAnimaliInRecizione(Integer id);

}
