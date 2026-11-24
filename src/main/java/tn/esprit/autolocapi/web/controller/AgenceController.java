package tn.esprit.autolocapi.web.controller;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Agence;
import tn.esprit.autolocapi.service.IAgenceService;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/agences")
public class AgenceController {
    private final IAgenceService agenceService;
    @PostMapping
    public Agence ajouterAgence(@RequestBody Agence agence) {
        return agenceService.ajouterAgence(agence);
    }
    @PutMapping
    public Agence modiferAgence(@RequestBody Agence agence){
        return agenceService.modifierAgence(agence);
    }
    @GetMapping("/{id}")
    public Agence getAgenceById(@PathVariable Long id){
        return agenceService.getAgenceById(id);
    }
    @GetMapping
    public List<Agence> getAgences(){
        return agenceService.getAllAgences();
    }
    @DeleteMapping("/{id}")
    public void supprimerAgence(@PathVariable Long id){
        agenceService.supprimerAgenceById(id);
    }
    @PostMapping("/ajouteragenceetaffectervehicules")
    public Agence ajouterAgenceEtAffecterVehicules(@RequestBody Agence agence) {return agenceService.ajouterAgenceEtAffecterVehicules(agence);}

}
