package tn.esprit.autolocapi.domain;

import jakarta.persistence.*;
import lombok.*;

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
}
