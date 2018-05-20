package kurwa.demo1.many_to_many;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Employee_Repository extends JpaRepository<Employee,Integer> {
}
