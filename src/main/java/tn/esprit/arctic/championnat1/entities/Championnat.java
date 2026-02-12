package tn.esprit.arctic.championnat1.entities;

import jakarta.persistence.*;
import jdk.jfr.Category;

import java.util.List;

@Entity
public class Championnat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChampionnat ;
    private Categorie categorie ;
    private String libelleC ;
    private Integer annee ;
    @OneToOne
    private DetailChampionnat championnatDetail;

    @ManyToMany(cascade = CascadeType.PERSIST,fetch=FetchType.EAGER)
    private List<Course> courses;
}
