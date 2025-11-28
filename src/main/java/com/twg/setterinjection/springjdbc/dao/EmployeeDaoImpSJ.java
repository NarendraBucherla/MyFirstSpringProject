package com.twg.setterinjection.springjdbc.dao;

import com.twg.setterinjection.jdbc.dto.Employee;
import com.twg.setterinjection.springjdbc.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

//import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDaoImpSJ implements EmployeeDaoSJ{
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public List<Employee> getEmployees() {
        String query = "select * from employee";
        EmployeeMapper rowMapper = new EmployeeMapper();
        List<Employee> employees = jdbcTemplate.query(query,rowMapper);
        return employees;
    }

    @Override
    public void addEmployee(Employee employee) {
      String query = "insert into employee (name, exp) values (?, ?)";
      jdbcTemplate.update(query,employee.getName(),employee.getExp());
    }

    @Override
    public Employee getEmployee(int id) {
        String query = "select * from employee where id = ?";
        EmployeeMapper rowMapper = new EmployeeMapper();
        Employee employee;
        employee = jdbcTemplate.queryForObject(query,rowMapper,id);
        return employee;
    }
}
