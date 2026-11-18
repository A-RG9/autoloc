package tn.esprit.autolocapi.web.controller;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Paiement;
import tn.esprit.autolocapi.service.IPaiementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/paiements")
public class PaiementController {
    private final IPaiementService paiementService;
    @PostMapping
    public Paiement ajouterPaiement(@RequestBody Paiement paiement){
        return paiementService.ajouterPaiement(paiement);
    }
    @PutMapping
    public Paiement modifierPaiement(@RequestBody Paiement paiement){
        return paiementService.modifierPaiement(paiement);
    }
    @GetMapping("/{id}")
    public Paiement getPaiementById(@PathVariable Long id){
        return paiementService.getPaiementById(id);
    }
    @GetMapping
    public List<Paiement> getAllPaiements(){
        return paiementService.getAllPaiements();
    }
    @DeleteMapping("/{id}")
    public void supprimerPaiement(@PathVariable Long id){
        paiementService.supprimerPaiementById(id);
    }


}
