package tn.esprit.autolocapi.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
@Entity
@Table(name= "vehicule")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;

    @Column(length = 50, nullable = false)
    private String immatriculation;

    @Column(length = 50, nullable = false)
    private String marque;

    @Column(length = 50, nullable = false)
    private String Modele;

    @Enumerated(EnumType.STRING)
    @Column(length = 20, nullable = false)
    private CategorieVehicule categorie;

    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal tarifJournalier;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false , length = 20)
    private StatutVehicule statut;
}
