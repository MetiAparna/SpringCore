package com.asses.Spring.util;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
//@Primary
@Qualifier("Bike")
public class Bike implements Vechical{

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("go to travel in bike");
		
	}

}
