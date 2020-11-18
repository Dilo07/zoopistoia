package zoopistoia_API.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import zoopistoia_API.Model.Accesso;


@Repository
public interface AccessiRepository extends JpaRepository<Accesso, Integer> {

}
