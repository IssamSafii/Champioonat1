package tn.esprit.arctic.championnat1.Services;
import tn.esprit.arctic.championnat1.Services.IPiloteService;
import tn.esprit.arctic.championnat1.entities.Pilote;
import tn.esprit.arctic.championnat1.Repository.IPiloteRepository;

public class PiloteService implements IPiloteService {
    IPiloteRepository pr;
    @Override
    public String addPilote(Pilote p) {
        pr.save(p);
        return "pilote ajoutee ";
    }
}
