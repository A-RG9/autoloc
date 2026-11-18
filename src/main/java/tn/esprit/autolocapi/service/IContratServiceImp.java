package tn.esprit.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import tn.esprit.autolocapi.domain.Contrat;
import tn.esprit.autolocapi.repository.ContratRepositoy;

import java.util.List;

@Service
@AllArgsConstructor
@RequestMapping("/api/contrats")
public class IContratServiceImp implements IContratService {
    private final ContratRepositoy contratRepositoy;

    @Override
    public Contrat ajouterContrat(Contrat contrat) {
        return contratRepositoy.save(contrat);
    }

    @Override
    public Contrat modifierContrat(Contrat contrat) {
        return contratRepositoy.save(contrat);
    }

    @Override
    public Contrat getContratById(Long id) {
        return contratRepositoy.findById(id).orElse(null);
    }

    @Override
    public List<Contrat> getAllContrats() {
        return contratRepositoy.findAll();
    }

    @Override
    public void supprimerContratById(Long id) {
        contratRepositoy.deleteById(id);
    }
}
