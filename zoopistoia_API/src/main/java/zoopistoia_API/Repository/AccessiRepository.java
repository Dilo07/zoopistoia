package zoopistoia_API.Repository;


import java.sql.Timestamp;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import zoopistoia_API.Model.Accesso;
import zoopistoia_API.Model.Recinzione;


@Repository
public interface AccessiRepository extends JpaRepository<Accesso, Integer> {
	//query per estrarre quali operatori sono entrati in una recinzione data come input (id recinzione)
	@Transactional
	@Query("FROM Accesso A, Dipendente D "
			+ "WHERE A.dipendente.id = D.id AND A.recinzione.id = ?1 AND A.data_ingresso > ?2 AND (A.data_uscita < ?3 OR A.data_uscita  = NULL)")
	public Accesso getDipinRec(Integer id,Timestamp datein,Timestamp dateout);
	
	//query per estrarre in quali recinzioni è entrato un operatore dato come input (id operatore)
	@Transactional
	@Query("FROM Accesso A, Recinzione R "
			+ "WHERE A.recinzione.id = R.id AND A.dipendente.id = ?1 AND A.data_ingresso > ?2 AND (A.data_uscita < ?3 OR A.data_uscita  = NULL)")
	public Accesso getRecforDip(Integer id,Timestamp datein,Timestamp dateout);
}
