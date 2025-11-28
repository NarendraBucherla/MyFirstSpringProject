package com.twg.setterinjection.springjdbc.bzlogic;

import com.twg.setterinjection.jdbc.dto.Employee;

public interface BzlogicSJ {
    void printEmployeeHikes();
    Employee getEmployee(int id);
    void addEmployee(Employee employee);
}
