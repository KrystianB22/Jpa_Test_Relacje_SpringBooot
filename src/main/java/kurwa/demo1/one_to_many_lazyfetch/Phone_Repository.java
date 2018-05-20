package kurwa.demo1.one_to_many_lazyfetch;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Phone_Repository extends JpaRepository<Phone,Integer> {
}
