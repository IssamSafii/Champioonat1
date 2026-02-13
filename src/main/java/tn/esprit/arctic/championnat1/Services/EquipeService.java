package tn.esprit.arctic.championnat1.Services;

import tn.esprit.arctic.championnat1.entities.Equipe;
import tn.esprit.arctic.championnat1.Repository.EquipeRepository;

public class EquipeService implements IEquipeService {
    EquipeRepository er;
    @Override
    public Equipe ajouterEquipe(Equipe equipe) {
        er.save(equipe);
        return equipe;
    }
}
