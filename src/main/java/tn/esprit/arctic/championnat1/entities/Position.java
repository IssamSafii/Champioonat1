package tn.esprit.arctic.championnat1.entities;

import jakarta.persistence.*;

@Entity
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPosition ;
    private String classement ;
    private String nbPoints ;
    @ManyToOne
    private Course course;

    @ManyToOne
    private Pilote pilote;

}
