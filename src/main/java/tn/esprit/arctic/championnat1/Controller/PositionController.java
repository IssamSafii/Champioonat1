package tn.esprit.arctic.championnat1.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.arctic.championnat1.Services.IPositionService;

@AllArgsConstructor
@RestController
public class PositionController  {
    IPositionService positionService ;
}
