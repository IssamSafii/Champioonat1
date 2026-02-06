package tn.esprit.arctic.championnat1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pilote {
    @Id
    private Long idPilote ;
    private String libelleP ;
    private Integer nbPointsTotal ;
    private Integer classementGeneral ;

}
