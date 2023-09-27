package stock.app.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import stock.app.web.models.Equipament;
import stock.app.web.services.EquipamentService;

@Controller
@RequestMapping("/equipaments")

public class EquipamentoController {
  @Autowired
  private EquipamentService equipamentService;

  public EquipamentoController(EquipamentService equipamentService) {
    this.equipamentService = equipamentService;
  }

  @GetMapping
  public String listEquipaments(Model model){
    List<Equipament> equipaments = equipamentService.findAllEquipament();
    model.addAttribute("equipaments", equipaments);
    return "equipament/equipaments";
  }

  @GetMapping("/new")
  public String newEquipament(){
    return "equipament/formCad";
  }


}
