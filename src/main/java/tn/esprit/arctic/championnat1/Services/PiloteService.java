package tn.esprit.arctic.championnat1.Services;
import tn.esprit.arctic.championnat1.entities.Pilote;
import tn.esprit.arctic.championnat1.Repository.PiloteRepository;

public class PiloteService implements IPiloteService {
    PiloteRepository pr;
    @Override
    public String addPilote(Pilote p) {
        pr.save(p);
        return "pilote ajoutee ";
    }
}
