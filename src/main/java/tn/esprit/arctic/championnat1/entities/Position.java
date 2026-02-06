package tn.esprit.arctic.championnat1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Position {
    @Id
    private Integer idPosition ;
    private String classement ;
    private String nbPoints ;

}
