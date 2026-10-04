package tn.esprit.autolocapi.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;

    @Column(nullable = false,length = 30)
    private String nom;

    @Column(nullable = false,length = 30)
    private String ville;

    @Column(nullable = false,length = 30)
    private String adresse;

    @Column(nullable = false,length = 10)
    private String telephone;

    @OneToMany(mappedBy = "agence", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Vehicule> vehicules = new ArrayList<>();

    @OneToMany(mappedBy = "agence", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Employe> employes = new ArrayList<>();
}
