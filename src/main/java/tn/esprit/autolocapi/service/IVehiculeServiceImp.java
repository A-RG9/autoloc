package tn.esprit.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import tn.esprit.autolocapi.domain.Equipement;
import tn.esprit.autolocapi.domain.Vehicule;
import tn.esprit.autolocapi.repository.EquipementRepository;
import tn.esprit.autolocapi.repository.VehiculeRepository;

import java.util.List;


@Service
@RequestMapping("/api/vehicules")
@AllArgsConstructor
public class IVehiculeServiceImp implements IVehiculeService {

    private final  VehiculeRepository vehiculeRepository;
    private final EquipementRepository equipementRepository;

    @Override
    public Vehicule ajouterVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule modifierVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule getVehiculeById(Long id) {
        return vehiculeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Vehicule> getAllVehicules() {
        return vehiculeRepository.findAll();
    }

    @Override
    public void SupprimerVehiculeById(Long id) {
        vehiculeRepository.deleteById(id);


    }

    @Override
    public Vehicule affecterEquipement(Long idVehicule, Long idEquipement) {

        Vehicule vehicule = vehiculeRepository.findById(idVehicule).orElse(null);

        Equipement equipement = equipementRepository.findById(idEquipement).orElse(null);

        if (vehicule != null && equipement != null) {
            vehicule.getEquipements().add(equipement);
            return vehiculeRepository.save(vehicule);
        }
        return null;
    }

    @Override
    public Vehicule desaffecterEquipement(Long idVehicule, Long idEquipement) {

        Vehicule vehicule = vehiculeRepository.findById(idVehicule).orElse(null);

        Equipement equipement = equipementRepository.findById(idEquipement).orElse(null);

        if (vehicule != null && equipement != null) {
            vehicule.getEquipements().remove(equipement);
            return vehiculeRepository.save(vehicule);
        }
        return null;
    }

}
