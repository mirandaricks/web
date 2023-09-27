package stock.app.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import stock.app.web.models.Equipament;

@Repository
public interface EquipamentRepository extends JpaRepository<Equipament, Long>{

}
