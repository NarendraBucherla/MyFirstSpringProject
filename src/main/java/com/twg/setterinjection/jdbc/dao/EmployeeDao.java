package com.twg.setterinjection.jdbc.dao;

import com.twg.setterinjection.jdbc.dto.Employee;

import java.util.List;

public interface EmployeeDao
{
    List<Employee> getEmployees();

}
