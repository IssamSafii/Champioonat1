package tn.esprit.arctic.championnat1.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Sponsor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSponsor ;
    private String nom ;
    private String pays ;
    private Float budgetAnnuel;
    private Boolean bloquerContrat;
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy="sponsor")
    private List<Contrat> contrats;

}
