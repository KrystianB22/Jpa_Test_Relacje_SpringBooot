package kurwa.demo1.one_to_many_lazyfetch;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Employee_Repository extends JpaRepository<Employee,Integer> {
    Employee findAllByName(String name);
}
