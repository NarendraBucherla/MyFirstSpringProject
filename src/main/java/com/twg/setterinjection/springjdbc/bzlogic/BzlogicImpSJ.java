package com.twg.setterinjection.springjdbc.bzlogic;

import com.twg.setterinjection.jdbc.dto.Employee;
import com.twg.setterinjection.springjdbc.dao.EmployeeDaoSJ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BzlogicImpSJ implements BzlogicSJ {
     @Autowired
    private EmployeeDaoSJ employeeDaoSJ;

    @Override
    public void printEmployeeHikes() {
        List<Employee> employeeList = employeeDaoSJ.getEmployees();
        for (Employee employee : employeeList) {
            if(employee.getExp()>20){
                System.out.println("Employee "+employee.getName()+" has got 30% hike");
            } else if (employee.getExp()>15) {
                System.out.println("Employee "+employee.getName()+" has got 25% hike");
            } else if (employee.getExp()>10) {
                System.out.println("Employee "+employee.getName()+" has got 20% hike");
            }else {
                System.out.println("Employee "+employee.getName()+" has got 15% hike");
            }
        }
    }

    @Override
    public Employee getEmployee(int id) {
        return employeeDaoSJ.getEmployee(id);
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeDaoSJ.addEmployee(employee);
    }
}
