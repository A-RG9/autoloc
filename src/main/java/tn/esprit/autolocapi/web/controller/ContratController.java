package tn.esprit.autolocapi.web.controller;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Contrat;
import tn.esprit.autolocapi.service.IContratService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/contrats")
public class ContratController {
    private final IContratService contratService;

    @PostMapping
    public Contrat ajouterContrat(@RequestBody Contrat contrat) {
        return contratService.ajouterContrat(contrat);
    }
    @PutMapping
    public Contrat modifierContrat(@RequestBody Contrat contrat) {
        return contratService.modifierContrat(contrat);
    }
    @GetMapping("/{id}")
    public Contrat getContratById(@PathVariable Long id) {
        return contratService.getContratById(id);
    }
    @GetMapping
    public List<Contrat> getAllContrats() {
        return contratService.getAllContrats();
    }
    @DeleteMapping("/{id}")
    public void SupprimerContratById(@PathVariable Long id) {
        contratService.supprimerContratById(id);
    }
}
