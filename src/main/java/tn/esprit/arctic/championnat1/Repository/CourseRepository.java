package tn.esprit.arctic.championnat1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.championnat1.entities.Course;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
