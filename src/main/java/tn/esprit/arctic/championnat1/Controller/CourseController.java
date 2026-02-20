package tn.esprit.arctic.championnat1.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.arctic.championnat1.Services.ICourseService;

@RestController
@AllArgsConstructor
public class CourseController  {
    ICourseService courseService ;
}
