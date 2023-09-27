package stock.app.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import stock.app.web.models.Technician;

@Repository
public interface TechnicianRepository extends JpaRepository<Technician, Long >{

}
