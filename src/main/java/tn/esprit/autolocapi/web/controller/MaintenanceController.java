package tn.esprit.autolocapi.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Maintenance;
import tn.esprit.autolocapi.service.IMaintenanceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/maintenances")
public class MaintenanceController {
    private final IMaintenanceService maintenanceService;

    @PostMapping
    public Maintenance ajouterMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.ajouterMaintenance(maintenance);
    }
    @PutMapping
    public Maintenance modifierMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.modifierMaintenance(maintenance);
    }
    @GetMapping("/{id}")
    public Maintenance getMaintenanceById(@PathVariable Long id) {
        return maintenanceService.getMaintenanceById(id);
    }
    @GetMapping
    public List<Maintenance> getAllMaintenances() {
        return maintenanceService.getAllMaintenances();
    }
    @DeleteMapping("/{id}")
    public void SupprimerMaintenanceById(@PathVariable Long id) {
        maintenanceService.supprimerMaintenanceById(id);
    }
}
