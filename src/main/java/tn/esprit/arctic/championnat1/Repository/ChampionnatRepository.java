package tn.esprit.arctic.championnat1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.championnat1.entities.Championnat;
import tn.esprit.arctic.championnat1.entities.Equipe;

public interface ChampionnatRepository extends JpaRepository<Championnat,Long> {

}
