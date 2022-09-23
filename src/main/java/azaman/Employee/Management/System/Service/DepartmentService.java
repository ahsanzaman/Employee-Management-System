package azaman.Employee.Management.System.Service;

import azaman.Employee.Management.System.Entity.Department;
import azaman.Employee.Management.System.Entity.Employee;
import azaman.Employee.Management.System.Repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;

    public String addDepartment(Department department) {
        return departmentRepo.addDepartment(department);
    }

    public Department getDepartment(long departmentID) {
        return departmentRepo.getDepartment(departmentID);
    }

    public String updateDepartment(Department department, long departmentID) {
        return departmentRepo.updateDepartment(department, departmentID);
    }

    public String deleteDepartment(long departmentID) {
        return departmentRepo.deleteDepartment(departmentID);
    }
}
