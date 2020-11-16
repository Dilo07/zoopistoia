package zoopistoia_API.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import zoopistoia_API.Model.Dipendente;

@Repository
public interface DipendentiRepository extends JpaRepository<Dipendente, Integer> {

}
