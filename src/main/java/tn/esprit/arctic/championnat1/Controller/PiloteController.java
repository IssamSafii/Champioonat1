package tn.esprit.arctic.championnat1.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.arctic.championnat1.Services.IPiloteService;

@AllArgsConstructor
@RestController
public class PiloteController  {
    IPiloteService piloteService ;
}
