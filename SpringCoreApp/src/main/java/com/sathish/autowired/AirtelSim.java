package com.sathish.autowired;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class AirtelSim implements Sim {

	@Override
	public void call() {

		System.out.println("Airtel sim  make call with 1RS/call ");
	}

}
