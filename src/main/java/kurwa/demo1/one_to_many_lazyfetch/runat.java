package kurwa.demo1.one_to_many_lazyfetch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class runat {

    private final Employee_Repository employee_repository;
    private final Phone_Repository phone_repository;

    Employee employee=new Employee();
    Phone phone =new Phone();
    Phone phone1 =new Phone();

    @Autowired
    public runat(Employee_Repository employee_repository, Phone_Repository phone_repository) {
        this.employee_repository = employee_repository;
        this.phone_repository = phone_repository;
    }

    @PostConstruct
    public void save(){
//
//        employee.setName("Jurek");
//        employee.setLast_name("Owsiak");
//        phone.setTyp("Plus");
//        phone.setNumber("1239875369");
//        phone.setEmployee(employee);
//        phone1.setTyp("Orange");
//        phone1.setNumber("9239875369");
//        phone1.setEmployee(employee);
//
//        employee_repository.save(employee);
//        phone_repository.save(phone);
//        phone_repository.save(phone1);

        Employee jurek = employee_repository.findAllByName("Jurek");
        System.out.println(jurek.getName());
         List<Phone> phones = jurek.getPhones();
         phones.stream().forEach(s-> System.out.println(s.getNumber()));// wywala wszystkich




    }

}
