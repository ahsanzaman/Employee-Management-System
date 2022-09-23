package azaman.Employee.Management.System.Controller;

import azaman.Employee.Management.System.Entity.Department;
import azaman.Employee.Management.System.Entity.Employee;
import azaman.Employee.Management.System.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/addDepartment")
    public String addDepartment(@RequestBody Department department) {
        return departmentService.addDepartment(department);
    }

    @GetMapping("/getDepartment/{departmentID}")
    public Department getDepartment(@PathVariable long departmentID) {
        return departmentService.getDepartment(departmentID);
    }

    @PatchMapping("/updateDepartment/{departmentID}")
    public String updateDepartment(@RequestBody Department department, @PathVariable long departmentID) {
        return departmentService.updateDepartment(department, departmentID);
    }

    @DeleteMapping("/deleteDepartment/{departmentID}")
    public String deleteDepartment(@PathVariable long departmentID) {
        return departmentService.deleteDepartment(departmentID);
    }

}
