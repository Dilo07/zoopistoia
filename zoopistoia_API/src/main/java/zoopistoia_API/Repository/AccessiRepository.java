package zoopistoia_API.Repository;


import java.sql.Timestamp;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import zoopistoia_API.Model.Accesso;


@Repository
public interface AccessiRepository extends JpaRepository<Accesso, Integer> {

	@Transactional
	@Query("FROM Accesso A, Dipendente D "
			+ "WHERE A.dipendente.id = D.id AND A.recinzione.id = ?1 AND A.data_ingresso > ?2 AND A.data_uscita < ?3")
	public Accesso getDipinRec(Integer id,Timestamp datein,Timestamp dateout);
}
