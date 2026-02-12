package tn.esprit.arctic.championnat1.entities;

import jakarta.persistence.*;

@Entity
public class DetailChampionnat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailchampionnat ;
    private String code ;
    private String desctiption ;
    @OneToOne(mappedBy="championnatDetail")
    private Championnat championnat;

}
