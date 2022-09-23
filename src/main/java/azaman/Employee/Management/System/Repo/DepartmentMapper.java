package azaman.Employee.Management.System.Repo;

import azaman.Employee.Management.System.Entity.Department;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentMapper implements RowMapper<Department> {
    @Override
    public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
        Department department = new Department();
        department.setDepartmentID(rs.getInt("departmentid"));
        department.setDepartmentName(rs.getString("departmentname"));
        department.setDepartmentHead(rs.getString("departmenthead"));
        return department;
    }
}
