package tn.esprit.autolocapi.web.controller;

import jakarta.validation.constraints.FutureOrPresent;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Vehicule;
import tn.esprit.autolocapi.service.IVehiculeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/vehicules")
public class VehiculeController {
    private final IVehiculeService vehiculeService;
    @PostMapping
    public Vehicule ajouterVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.ajouterVehicule(vehicule);
    }
    @PutMapping
    public Vehicule modifierVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.modifierVehicule(vehicule);
    }
    @GetMapping("/{id}")
    public Vehicule getVehiculeById(@PathVariable Long id) {
        return vehiculeService.getVehiculeById(id);
        
    }
    @GetMapping
    public List<Vehicule> getAllVehicules() {
        return vehiculeService.getAllVehicules();
    }
    @DeleteMapping("/{id}")
    public void supprimerVehiculeById(@PathVariable Long id) {
        vehiculeService.SupprimerVehiculeById(id);
    }
    
    
}
