package com.asses.Spring.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Autowired
	private Vechical vechical;
	
	public void goingToWork() {
		vechical.travel();
		
	}
	
	

}
