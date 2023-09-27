package stock.app.web.services;

import java.util.List;

import stock.app.web.models.Equipament;

public interface EquipamentService {
  Equipament insertEquipament(Equipament equipament);
  Equipament updateEquipament(Long id , Equipament equipament);
  void deleteEquipament(Long id);
  List<Equipament> findAllEquipament();
  Equipament findByIdEquipament(Long id);

}
