package guru.springframework.Payroll;

import guru.springframework.Payroll.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRepository extends JpaRepository<Employee, Long> {

}