package tn.esprit.autolocapi.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;

    @Column(nullable = false,length = 30)
    private String nom;

    @Column(nullable = false,length = 30)
    private String prenom;

    @Column(nullable = false,length = 30)
    private String email;

    @Column(nullable = false,length = 10)
    private String telephone;

    @Column(nullable = false,length = 12)
    private String numPermis;

    @Column(nullable = false)
    private LocalDate dateInscription;

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    private List<Reservation> reservations = new ArrayList<>();

}
