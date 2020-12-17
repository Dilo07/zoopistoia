package zoopistoia_API.Repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import zoopistoia_API.Model.Recinzione;

@Repository
public interface RecinzioniRepository extends JpaRepository<Recinzione, Integer> {
	
//	Query per estrarre i dipendenti che hanno accesso ad una recinzione passata in ingresso (id recinzione)
//	@Transactional
//	@Query("FROM Recinzione R, Permesso P " 
//	  + "WHERE R.permessi.id = R.id AND R.permessi.id = ?1")
//	public List<Recinzione> getPermessiDipendentiInRecizione(Integer id);
}
