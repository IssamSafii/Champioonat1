package tn.esprit.arctic.championnat1.entities;
import jakarta.persistence.*;

@Entity
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat ;
    private Float Montant ;
    private String annee ;
    private Boolean archived ;
    @ManyToOne
    private Equipe equipe;

    @ManyToOne
    private Sponsor sponsor;




}
