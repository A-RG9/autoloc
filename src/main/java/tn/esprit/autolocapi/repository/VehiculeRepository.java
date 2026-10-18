package tn.esprit.autolocapi.repository;

import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autolocapi.domain.Vehicule;

import java.io.Serializable;

public interface VehiculeRepository extends JpaRepository<Vehicule,Long> {
    
}
