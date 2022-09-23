package azaman.Employee.Management.System.Service;

import azaman.Employee.Management.System.Entity.Employee;
import azaman.Employee.Management.System.Repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public String addEmployeeService(Employee employee) {
        return employeeRepo.addEmployee(employee);
    }

    public Employee searchEmployeeByIDService(long id) {
        return employeeRepo.searchEmployeeByID(id);
    }

    public String updateEmployee(Employee employee, long id) {
        return employeeRepo.updateEmployee(employee, id);
    }

    public String deleteEmployee(long id) {
        return employeeRepo.deleteEmployee(id);
    }
}
