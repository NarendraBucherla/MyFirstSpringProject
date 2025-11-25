package com.twg.setterinjection;

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

       Order order = (Order)context.getBean("ord");
       System.out.println(order.toString());
       Customer customer = (Customer)context.getBean("cus");
       System.out.println(customer.getName());
    }
}
