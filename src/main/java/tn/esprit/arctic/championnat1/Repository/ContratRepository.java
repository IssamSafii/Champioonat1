package tn.esprit.arctic.championnat1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.championnat1.entities.Contrat;

public interface ContratRepository extends JpaRepository<Contrat,Long> {
}
