package kurwa.demo1.Dziedziczenie_Join_osobne_tabele;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Employee_Repository extends JpaRepository<Employee,Integer> {
    Employee findAllByName(String name);// zapytanie o imie
}
