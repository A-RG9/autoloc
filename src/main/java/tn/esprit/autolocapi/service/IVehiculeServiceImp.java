package tn.esprit.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import tn.esprit.autolocapi.domain.Vehicule;
import tn.esprit.autolocapi.repository.VehiculeRepository;

import java.util.List;


@Service
@RequestMapping("/api/vehicules")
@AllArgsConstructor
public class IVehiculeServiceImp implements IVehiculeService {

    /*@Autowired
    private VehiculeRepository vehiculeRepository;*/

    private final  VehiculeRepository vehiculeRepository;

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
}
