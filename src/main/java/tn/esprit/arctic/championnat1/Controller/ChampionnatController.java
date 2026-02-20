package tn.esprit.arctic.championnat1.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.arctic.championnat1.Services.IChampionnatService;
import tn.esprit.arctic.championnat1.Services.ISponsorService;

@RestController
@AllArgsConstructor
public class ChampionnatController  {
    IChampionnatService championnatService ;
}
