package com.asses.Spring.util;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javassist.expr.Instanceof;

@Qualifier("car")
@Primary
@Component
public class car implements Vechical{

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("go to travel in car");
		
		
	}

}
