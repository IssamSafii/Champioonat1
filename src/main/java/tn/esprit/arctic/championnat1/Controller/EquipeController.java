package tn.esprit.arctic.championnat1.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.arctic.championnat1.Services.IEquipeService;

@AllArgsConstructor
@RestController
public class EquipeController  {
    IEquipeService equipeService ;
}
