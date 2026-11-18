package tn.esprit.autolocapi.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Equipement;
import tn.esprit.autolocapi.service.IEquipementService;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/api/equipements")
public class EquipementController {
    private final IEquipementService equipementService;

    @PostMapping
    public Equipement ajouterEquipement(@RequestBody Equipement equipement) {
        return equipementService.ajouterEquipement(equipement);
    }
    @PutMapping
    public Equipement modifierEquipement(@RequestBody Equipement equipement) {
        return equipementService.modifierEquipement(equipement);
    }
    @GetMapping("/{id}")
    public Equipement getEquipementById(@PathVariable Long id) {
        return equipementService.getEquipementById(id);
    }
    @GetMapping
    public List<Equipement> getAllEquipements() {
        return equipementService.getAllEquipements();
    }
    @DeleteMapping("/{id}")
    public void SupprimerEquipementById(@PathVariable Long id) {
        equipementService.supprimerEquipementById(id);
    }
}
