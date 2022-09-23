package azaman.Employee.Management.System.Repo;

import azaman.Employee.Management.System.Entity.Department;
import azaman.Employee.Management.System.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentRepo {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public String addDepartment(Department department) {
        String query="insert into Department (departmentid, departmentname, departmenthead)  values(?,?,?)";
        this.jdbcTemplate.update(query, department.getDepartmentID(), department.getDepartmentName(), department.getDepartmentHead());
        return "Insert successful.";
    }

    public Department getDepartment(long departmentID) {
        String query = "SELECT * FROM Department WHERE departmentid="+departmentID+";";
        Department department = this.jdbcTemplate.queryForObject(query, new DepartmentMapper());
        return department;
    }

    public String updateDepartment(Department department, long departmentID) {
        String query = "update Department SET departmentid=?, departmentname=?, departmenthead=? WHERE departmentid="+departmentID+";";
        this.jdbcTemplate.update(query, department.getDepartmentID(), department.getDepartmentName(), department.getDepartmentHead());
        return "Update successful.";
    }

    public String deleteDepartment(long departmentID) {
        String query = "DELETE FROM Department WHERE departmentid="+departmentID+";";
        this.jdbcTemplate.execute(query);
        return "Delete successfull.";
    }
}
