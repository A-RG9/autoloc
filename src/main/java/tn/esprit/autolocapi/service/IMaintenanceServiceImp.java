package tn.esprit.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import tn.esprit.autolocapi.domain.Maintenance;
import tn.esprit.autolocapi.repository.MaintenanceRepository;

import java.util.List;

@Service
@AllArgsConstructor
@RequestMapping("/api/maintenances")
public class IMaintenanceServiceImp implements IMaintenanceService {
    final private MaintenanceRepository maintenanceRepository;
    @Override
    public Maintenance ajouterMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance modifierMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance getMaintenanceById(Long id) {
        return maintenanceRepository.findById(id).orElse(null);
    }

    @Override
    public List<Maintenance> getAllMaintenances() {
        return maintenanceRepository.findAll();
    }

    @Override
    public void supprimerMaintenanceById(Long id) {
        maintenanceRepository.deleteById(id);

    }
}
