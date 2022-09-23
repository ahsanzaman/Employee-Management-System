package azaman.Employee.Management.System.Controller;

import azaman.Employee.Management.System.Entity.Employee;
import azaman.Employee.Management.System.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployeeService(employee);
    }

    @GetMapping("/getEmployee/{id}")
    public Employee searchEmployee(@PathVariable long id) {
        return employeeService.searchEmployeeByIDService(id);
    }

    @PatchMapping("/updateEmployee/{id}")
    public String updateEmployee(@RequestBody Employee employee, @PathVariable long id) { return employeeService.updateEmployee(employee, id); }

    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable long id) { return employeeService.deleteEmployee(id);}
}
