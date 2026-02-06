package tn.esprit.arctic.championnat1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Course {
    @Id
    private long Idcourse ;
    private String emplacement ;
    private LocalDate dateCourse ;
}
