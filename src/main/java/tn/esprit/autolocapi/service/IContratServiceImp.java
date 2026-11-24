package tn.esprit.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Contrat;
import tn.esprit.autolocapi.domain.Reservation;
import tn.esprit.autolocapi.repository.ContratRepositoy;
import tn.esprit.autolocapi.repository.ReservationRepository; // check exact repository name

import java.util.List;

@Service
@AllArgsConstructor
public class IContratServiceImp implements IContratService {

    private final ContratRepositoy contratRepositoy;
    private final ReservationRepository reservationRepository; // check exact repository name

    @Override
    public Contrat ajouterContrat(Contrat contrat) {
        if (contrat.getReservation() != null && contrat.getReservation().getIdReservation() != null) {
            Reservation managedReservation = reservationRepository
                    .findById(contrat.getReservation().getIdReservation())
                    .orElseThrow(() -> new RuntimeException("Reservation not found"));
            contrat.setReservation(managedReservation);
        }
        return contratRepositoy.save(contrat);
    }

    @Override
    public Contrat modifierContrat(Contrat contrat) {
        if (contrat.getReservation() != null && contrat.getReservation().getIdReservation() != null) {
            Reservation managedReservation = reservationRepository
                    .findById(contrat.getReservation().getIdReservation())
                    .orElseThrow(() -> new RuntimeException("Reservation not found"));
            contrat.setReservation(managedReservation);
        }
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
        contratRepositoy.findById(id).ifPresent(contrat -> {
            if (contrat.getReservation() != null) {
                contrat.getReservation().setContrat(null);
                contrat.setReservation(null);
            }
            contratRepositoy.delete(contrat);
        });
    }
}