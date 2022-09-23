package azaman.Employee.Management.System.Repo;

import azaman.Employee.Management.System.Entity.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Employee employee = new Employee();
        employee.setId(resultSet.getInt("id"));
        employee.setFirstName(resultSet.getString("firstname"));
        employee.setLastName(resultSet.getString("lastname"));
        employee.setEmployeeType(resultSet.getString("employeetype"));
        employee.setDepartment(resultSet.getString("department"));
        employee.setLocalAddress(resultSet.getString("localaddress"));
        employee.setPermanentAddress(resultSet.getString("permanentaddress"));
        return employee;
    }
}
