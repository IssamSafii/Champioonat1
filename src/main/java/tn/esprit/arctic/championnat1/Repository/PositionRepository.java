package tn.esprit.arctic.championnat1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.championnat1.entities.Position;

public interface PositionRepository extends JpaRepository<Position, Integer> {

}
