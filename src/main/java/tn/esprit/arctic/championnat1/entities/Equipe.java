package tn.esprit.arctic.championnat1.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idequipe ;
    private String libelle ;
    private Integer nbPointsTotal ;
    private Integer classementGeneral;
    @OneToMany(mappedBy = "equipe", cascade = CascadeType.PERSIST)
    private List<Pilote> Pilotes;

    @OneToMany(mappedBy = "equipe", cascade = CascadeType.PERSIST)
    private List<Contrat> contarts;

}
