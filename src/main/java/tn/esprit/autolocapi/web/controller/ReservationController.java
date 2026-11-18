package tn.esprit.autolocapi.web.controller;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Reservation;
import tn.esprit.autolocapi.service.IReservationService;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/reservations")
public class ReservationController {
    private final IReservationService reservationService;
    @PostMapping
    public Reservation ajouterReservation(@RequestBody Reservation reservation){
        return reservationService.ajouterReservation(reservation);
    }
    @PutMapping
    public Reservation modifierReservation(@RequestBody Reservation reservation){
        return reservationService.modifierReservation(reservation);
    }
    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable Long id){
        return reservationService.getReservationById(id);
    }
    @GetMapping
    public List<Reservation> getAllReservations(){
        return reservationService.getAllReservations();
    }
    @DeleteMapping("/{id}")
    public void SupprimerReservationById(@PathVariable Long id){
        reservationService.SupprimerReservationById(id);


    }


}
