package zoopistoia_API.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import zoopistoia_API.Model.Recinzione;

@Repository
public interface RecinzioniRepository extends JpaRepository<Recinzione, Integer> {

}
