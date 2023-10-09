package com.sathish.autowired;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Phone {

//	@Value("iphone")
	@Value("${phonename}")
	private String phone;
	@Value("${model}")
	private int model;
	
//	@Autowired  // DI
//	private AirtelSim airtelSim;
//	@Autowired
//	private JioSim jioSim;
	
//	@Autowired
//	private Sim sim;   // create airtel sim cupcast to sim  
	
	@Autowired
//	@Qualifier(value = "jioSim")
	//@Qualifier(value = "airtelSim")
	
	//@Qualifier(value = "${sim.type}")
	@Resource(name = "${sim.type}")
	private Sim sim; 
	
	@Autowired
	private Battery battery;
	
//	@Autowired
//	public Phone(AirtelSim airtelSim) {
//		super();
//		this.airtelSim = airtelSim;
//	}

	void insertSim() {
		sim.call();
		System.out.println("Myphone running with :"+battery.brand +" Battery");
	}
	
	void phoneSpecfic() {
		System.out.println("Myphone is:"+phone);
		System.out.println("Myphone Model :"+model);
	}
//@Autowired
//	public void setAirtelSim(AirtelSim airtelSim) {
//		this.airtelSim = airtelSim;
//	}
}
