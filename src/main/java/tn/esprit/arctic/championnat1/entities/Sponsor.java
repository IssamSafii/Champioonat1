package tn.esprit.arctic.championnat1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Sponsor {
    @Id
    private Integer idSponsor ;
    private String nom ;
    private String pays ;
    private Float budgetAnnuel;
    private Boolean bloquerContrat;
}
