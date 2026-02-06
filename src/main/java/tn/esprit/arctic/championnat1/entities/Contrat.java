package tn.esprit.arctic.championnat1.entities;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class Contrat {
    @Id
    private Long idContrat ;
    private Float Montant ;
    private String annee ;
    private Boolean archived ;



}
