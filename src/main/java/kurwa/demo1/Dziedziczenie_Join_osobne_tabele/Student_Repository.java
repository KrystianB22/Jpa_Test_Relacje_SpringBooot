package kurwa.demo1.Dziedziczenie_Join_osobne_tabele;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Student_Repository extends JpaRepository<Student,Integer> {
}
