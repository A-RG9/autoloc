package tn.esprit.autolocapi.web.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Employe;
import tn.esprit.autolocapi.service.IEmployeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employees")
public class EmployeController {
    private final IEmployeService employeService;

    @PostMapping
    public Employe ajouterEmploye(@RequestBody Employe employe) {
        return employeService.ajouterEmploye(employe);
    }
    @PutMapping
    public Employe modifierEmploye(@RequestBody Employe employe) {
        return employeService.modifierEmploye(employe);
    }
    @GetMapping("/{id}")
    public Employe getEmployeById(@PathVariable Long id) {
        return employeService.getEmployeById(id);
    }
    @GetMapping
    public List<Employe> getAllEmploye() {
        return employeService.getAllEmployees();
    }
    @DeleteMapping("/{id}")
    public void SupprimerEmployeById(@PathVariable Long id) {
        employeService.supprimerEmployeById(id);
    }
    @PutMapping("/desaffecterEmploye/{idEmploye}")
    public Employe desaffecterEmploye (@PathVariable Long idEmploye) {
        return employeService.desaffecterEmploye(idEmploye);
    }
    @PutMapping("/affecterEmploye/{idEmploye}/{idAgence}")
    public Employe affecterEmploye(@PathVariable Long idEmploye, @PathVariable Long idAgence){
        return employeService.affecterEmploye(idEmploye,idAgence);
    }
}

