package stock.app.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import stock.app.web.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long>{

}
