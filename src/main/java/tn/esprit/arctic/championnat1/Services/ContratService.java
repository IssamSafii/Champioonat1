package tn.esprit.arctic.championnat1.Services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.championnat1.Repository.ContratRepository;
import tn.esprit.arctic.championnat1.entities.Contrat;

import java.time.LocalDate;
import java.util.List;
@Slf4j
@Service
@EnableScheduling
@AllArgsConstructor
public class ContratService implements IContratService {
    ContratRepository contratRepository;

    @Scheduled(cron = "*/30 * * * * *")
    public void archiverContratsExpireesEtAffichageContratsActifsParEquipe() {
        List<Contrat> contrats = contratRepository.findAll();
        for (Contrat c : contrats) {
            if (Integer.parseInt(c.getAnnee()) < LocalDate.now().getYear()) {
                c.setArchived(true);
                contratRepository.save(c);
            }
            log.info("l'equipe " + c.getEquipe() + "a un contrat d'un montant" + c.getMontant() + "avec le sponsor" + c.getSponsor().getNom());

        }
        List<Contrat> actifs = contratRepository.findByArchivedFalse();
        for (Contrat c :actifs){
            if (c.getEquipe() != null) {
                System.out.println("L'équipe " + c.getEquipe()+
                        " a un contrat actif de " + c.getMontant() +
                        " DT pour l'année " + c.getAnnee());
            }
        }
    }
    }
