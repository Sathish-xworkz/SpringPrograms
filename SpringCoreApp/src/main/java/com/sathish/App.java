package com.sathish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//Instantiating the Spring Container by Using
    	
    	ApplicationContext apctx=new AnnotationConfigApplicationContext(AppConfig.class);
    	Student stu= apctx.getBean(Student.class);
//    	 Book b= apctx.getBean(Book.class);
//    	 
//    	 b.setBid(3322);
//    	 b.setName("spring");
//    	 
//    	stu.setSid(233);
//    	stu.setName("lisha");
//    	stu.setBook(b);
    	
    	
    	System.out.println(stu);
////    	Student stu= apctx.getBean("myst",Student.class);
//    	stu.reading();
//    	stu.coding();
//    	stu.setName("divya");
//    	stu.setSid(900);
//    	System.out.println(stu.getName());
//    	System.out.println(stu.getSid());
//    	
//    	Book b=apctx.getBean(Book.class);
//    	b.setBid(234);
//    	b.setName("Java");
//    	
//    	System.out.println(b.getBid());
//    	System.out.println(b.getName());
    	
    }
}
