package edu.poly.lab4.respoitory;

import edu.poly.lab4.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRespository extends JpaRepository<Employee,Long>{


    class DemoredisApplication {
    }
}
