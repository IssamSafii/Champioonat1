package tn.esprit.arctic.championnat1.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.arctic.championnat1.Services.ISponsorService;

@AllArgsConstructor
@RestController
public class SponsorController {
    ISponsorService sponsorService ;
}
