package kurwa.demo1.Dziedziczenie_SingleTable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Employee_Repository extends JpaRepository<Employee,Integer> {
}
