package tn.esprit.arctic.championnat1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jfr.Category;

@Entity
public class Championnat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChampionnat ;
    private Categorie categorie ;
    private String libelleC ;
    private Integer annee ;
}
