package zoopistoia_API.Dipendenti;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DipendentiRepository extends JpaRepository<Dipendente, Integer> {

}
