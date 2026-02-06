package tn.esprit.arctic.championnat1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Equipe {
    @Id
    private Long idequipe ;
    private String libelle ;
    private Integer nbPointsTotal ;
    private Integer classementGeneral;


}
