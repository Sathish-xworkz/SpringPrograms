package com.sathish.SpringMVCTEST;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sathish.config.AppConfig;
import com.sathish.controller.EmployeeController;
import com.sathish.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext apx=new AnnotationConfigApplicationContext(AppConfig.class);
        
//        Employee employee= apx.getBean(Employee.class);
//        System.out.println(employee);
        
        EmployeeController emController= apx.getBean(EmployeeController.class);
       Employee empres= emController.empInfo();
        System.out.println(empres);
    }
}
