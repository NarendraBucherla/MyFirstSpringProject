package com.twg.setterinjection.jdbc.dao;

import com.twg.setterinjection.jdbc.dto.Employee;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
@Component
public class EmployeeDaoImp implements EmployeeDao {
    @Override
    public List<Employee> getEmployees() {
        String username="root";
        String password="Sathya@02";
        String driver="com.mysql.cj.jdbc.Driver";
        String url="jdbc:mysql://127.0.0.1:3306/spring";
        List<Employee> employees=new ArrayList<Employee>();

        try {
            //Class.forName(driver);
            Connection conn= DriverManager.getConnection(url,username,password);
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from employee");

            while (rs.next()) {
                Employee employee=new Employee();
                employee.setId(rs.getInt("id"));
                 employee.setName(rs.getString("name"));
                 employee.setExp(rs.getInt("exp"));
                 employees.add(employee);
            }
            conn.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return employees;
    }
}
