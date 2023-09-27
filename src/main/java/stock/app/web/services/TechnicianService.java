package stock.app.web.services;

import java.util.List;

import stock.app.web.models.Technician;

public interface TechnicianService {
  Technician insertTechnician(Technician technician);
  Technician updateTechnician(Long id,Technician technician);
  void deleteTechnician(Long id);
  List<Technician> findAllTechnician();
  Technician findByIdTechnician(Long id);

}
