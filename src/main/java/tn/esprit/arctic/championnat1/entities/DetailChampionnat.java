package tn.esprit.arctic.championnat1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DetailChampionnat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailchampionnat ;
    private String code ;
    private String desctiption ;


}
