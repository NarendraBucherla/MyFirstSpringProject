package com.twg.setterinjection.springjdbc.dao;

import com.twg.setterinjection.jdbc.dto.Employee;

import java.util.List;

public interface EmployeeDaoSJ {
   List<Employee> getEmployees();
    void addEmployee(Employee employee);
    Employee getEmployee(int id);
}
