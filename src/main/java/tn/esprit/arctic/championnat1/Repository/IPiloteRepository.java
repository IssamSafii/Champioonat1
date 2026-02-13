package tn.esprit.arctic.championnat1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.championnat1.entities.Pilote;

public interface IPiloteRepository extends JpaRepository<Pilote,Long> {
}
