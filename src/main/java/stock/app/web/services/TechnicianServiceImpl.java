package stock.app.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stock.app.web.models.Technician;
import stock.app.web.repositories.TechnicianRepository;

@Service
public class TechnicianServiceImpl implements TechnicianService {

  @Autowired
  private TechnicianRepository technicianRepository;

  public TechnicianServiceImpl(TechnicianRepository technicianRepository) {
    this.technicianRepository = technicianRepository;
  }

  @Override
  public Technician insertTechnician(Technician technician) {
    return technicianRepository.save(technician);
  }


  @Override
  public void deleteTechnician(Long id) {
    technicianRepository.deleteById(id);
  }
  @Override
  public List<Technician> findAllTechnician() {
    return technicianRepository.findAll();
  }

  @Override
  public Technician findByIdTechnician(Long id) {
    return technicianRepository.findById(id).orElse(null);
  }

  @Override
  public Technician updateTechnician(Long id, Technician technician) {
    if(technicianRepository.existsById(id)){
      technician.setId(id);
      return technicianRepository.save(technician);
    }
    return null;
  }

}
