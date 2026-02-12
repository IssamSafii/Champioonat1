package tn.esprit.arctic.championnat1.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Pilote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPilote ;
    private String libelleP ;
    private Integer nbPointsTotal ;
    private Integer classementGeneral ;
    @OneToMany(mappedBy = "pilote", cascade = CascadeType.PERSIST)
    private List<Position> Positions;

    @ManyToOne
    private Equipe equipe;
}
