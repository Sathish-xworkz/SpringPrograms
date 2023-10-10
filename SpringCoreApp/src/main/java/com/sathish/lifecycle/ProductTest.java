package com.sathish.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext apctx=new AnnotationConfigApplicationContext();
		apctx.register(BootConfig.class);
		apctx.refresh();
		
		Product p= apctx.getBean(Product.class);
		
		p.setPid(1233);
		p.setPname("laptop");
		
		p.disp();
		
		apctx.close();
		
	}

}
