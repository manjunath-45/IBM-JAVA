package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.Random;

import org.example.model.Department;
import org.example.model.Employee;
import org.example.model.Location;
import org.example.model.SpringConfig;
import org.example.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        try 
        {
     
     /*   	
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee e = context.getBean("employee",Employee.class);
        System.out.println(e);
        Department d = context.getBean("department",Department.class);
        Location l = context.getBean("location",Location.class);
        l.setLocationId(100);
        l.setLocationName("hyd");
        l.setCountry("india");
        d.setDepartementId(101);
        //d.setDepartmentName("sales");
        d.setLocation(l);
        e.setEmployeeId(new Random().nextInt(10000));
        //e.setEmployeeName("John Doe");
        //e.setSalary(20000);
        e.setDepartment(d);
        
        
        Student student =context.getBean("s",Student.class);
        System.out.println(student);
        Student student1 =context.getBean("s",Student.class);
        System.out.println(student1);
        Student student2 =context.getBean("s",Student.class);
        System.out.println(student2);
        
        System.out.println((student == student1 && student == student2));
       
        */
        	
       ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class) 	;
       Student student = context.getBean("s",Student.class);
       //student.setId(1);
       //student.setName("john");
       System.out.println(student);
       
       Employee e=context.getBean("employee",Employee.class);
       System.out.println(e);
       
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
    }
}
