package com.twg.setterinjection;

//import com.twg.setterinjection.jdbc.bsnlogic.EmployeeBzImp;
import com.twg.setterinjection.jdbc.dto.Employee;
import com.twg.setterinjection.springjdbc.bzlogic.BzlogicSJ;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\Ravindra Bucherla\\IdeaProjects\\myfirstproject\\src\\main\\java\\com\\twg\\setterinjection\\ConfigMetaData.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("ConfigMetaData.xml");
       /*
        //wiring
       Order order = (Order)context.getBean("order");
       System.out.println(order.toString());
       Customer customer = (Customer)context.getBean("customer");
       System.out.println(customer.toString());
        */
        //JDBC
        //EmployeeBzImp employeeBzImp = (EmployeeBzImp)context.getBean("bzlogicImpSJ");
        BzlogicSJ employeeBzImp = (BzlogicSJ)context.getBean("bzlogicImpSJ");
       // employeeBzImp.printEmployeeHikes();
        System.out.println(employeeBzImp.getEmployee(2));
        Employee employee = new Employee();
        employee.setName("Ravindra Bucherla");
        employee.setExp(5);
        //employeeBzImp.addEmployee(employee);
        System.out.println(employeeBzImp.getEmployee(5));


    }
}
