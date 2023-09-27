package stock.app.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import stock.app.web.models.Cause;

@Repository
public interface CauseRepository extends JpaRepository<Cause, Long>{

}
