package azaman.Employee.Management.System.Repo;

import azaman.Employee.Management.System.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepo {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public String addEmployee(Employee employee) {
        /*String query = "INSERT INTO Employee (id, firstname, lastname, employeetype, department, permanentaddress, localaddress) VALUES(\'"
                +employee.getId()+"\', \'"+employee.getFirstName()+"\', \'"+employee.getLastName()+"\', \'"+employee.getEmployeeType() +"\', \'"
                +employee.getDepartment()+"\', \'"+employee.getPermanentAddress()+"\', \'"+employee.getLocalAddress()+"\')";
        jdbcTemplate.execute(query);*/
        String query="insert into Employee (id, firstname, lastname, employeetype, department, permanentaddress, localaddress)  values(?,?,?,?,?,?,?)";
        this.jdbcTemplate.update(query, employee.getId(),employee.getFirstName(),employee.getLastName(),employee.getEmployeeType(),employee.getDepartment(),employee.getPermanentAddress(),employee.getLocalAddress());
        return "Insert successful.";
    }

    public Employee searchEmployeeByID(long id) {
        String query= "SELECT * FROM employee WHERE id="+id+";";
        Employee employee = this.jdbcTemplate.queryForObject(query, new EmployeeMapper());
        return employee;
    }

    public String updateEmployee(Employee employee, long id) {
        String query="update Employee SET id=?, firstname=?, lastname=?, employeetype=?, department=?, permanentaddress=?, localaddress=?  WHERE id="+id+";";
        this.jdbcTemplate.update(query, employee.getId(),employee.getFirstName(),employee.getLastName(),employee.getEmployeeType(),employee.getDepartment(),employee.getPermanentAddress(),employee.getLocalAddress());
        return "Update successful.";
    }

    public String deleteEmployee(long id) {
        String query="DELETE FROM EMPLOYEE WHERE id="+id+";";
        this.jdbcTemplate.execute(query);
        return "Delete successful.";
    }
}
