package com.sathish.xworkz.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductsController {


	@RequestMapping("/viewproduct")
	public ModelAndView showAllProducts() {
		List<String> productList=new ArrayList<>();
		productList.add("iphone14");
		productList.add("imac");
		productList.add("samsung");
		productList.add("laptop");
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("viewproducts");
		mv.addObject("products", productList);
		return mv;
	}
	
	
}
