package com.twg.setterinjection.jdbc.bsnlogic;

import com.twg.setterinjection.jdbc.dao.EmployeeDao;
import com.twg.setterinjection.jdbc.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeBzImp implements EmployeeBz{
    @Autowired
    private EmployeeDao employeeDao;


    @Override
    public void printEmployeeHikes() {
        List<Employee> employees = employeeDao.getEmployees();
        for (Employee employee : employees) {
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
}
