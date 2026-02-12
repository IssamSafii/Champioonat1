package tn.esprit.arctic.championnat1.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Idcourse ;
    private String emplacement ;
    private LocalDate dateCourse ;
    @ManyToMany(mappedBy="courses", cascade = CascadeType.PERSIST,fetch=FetchType.EAGER)
    private List<Championnat> Championnats;

    @OneToMany(mappedBy = "course", cascade = CascadeType.PERSIST)
    private List<Position> Positions;

}
