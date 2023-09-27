package stock.app.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stock.app.web.models.Equipament;
import stock.app.web.repositories.EquipamentRepository;

@Service
public class EquipamentServiceImpl implements EquipamentService {

  @Autowired
  private EquipamentRepository equipamentRepository;

  public EquipamentServiceImpl(EquipamentRepository equipamentRepository) {
    this.equipamentRepository = equipamentRepository;
  }

  @Override
  public Equipament insertEquipament(Equipament equipament) {
    return equipamentRepository.save(equipament);
  }

  @Override
  public Equipament updateEquipament(Long id, Equipament equipament) {
    if(equipamentRepository.existsById(id)){
      equipament.setId(id);
      return equipamentRepository.save(equipament);
    }
    return null;
  }

  @Override
  public void deleteEquipament(Long id) {
    equipamentRepository.deleteById(id);
  }
  @Override
  public List<Equipament> findAllEquipament() {
    return equipamentRepository.findAll();
  }

  @Override
  public Equipament findByIdEquipament(Long id) {
    return equipamentRepository.findById(id).orElse(null);
  }

}
