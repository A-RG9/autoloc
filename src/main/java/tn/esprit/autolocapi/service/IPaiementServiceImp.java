package tn.esprit.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import tn.esprit.autolocapi.domain.Paiement;
import tn.esprit.autolocapi.repository.PaiementRepository;

import java.util.List;

@Service
@AllArgsConstructor
@RequestMapping("/api/paiements")
public class IPaiementServiceImp implements IPaiementService {

    private final PaiementRepository paiementRepository;

    @Override
    public Paiement ajouterPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public Paiement modifierPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public Paiement getPaiementById(Long id) {
        return paiementRepository.findById(id).orElse(null);
    }

    @Override
    public List<Paiement> getAllPaiements() {
        return paiementRepository.findAll();
    }

    @Override
    public void supprimerPaiementById(Long id) {
        paiementRepository.deleteById(id);

    }
}
