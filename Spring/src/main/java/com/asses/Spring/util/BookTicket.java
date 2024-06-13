package com.asses.Spring.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")//it is used create number of objects created by using scope
@Component//it is class level annotation.it creates the object of this class
public class BookTicket 
{
	//private PaymentGateway gateway= new PaymentGateway();here we facing tight coupling concept,this avoid we use Dependency injection
	//Dependency(required) injection(reference) to using this annotation is @autowired
	@Autowired
	private PaymentGateway gateway;
	
	public BookTicket()
	{
	  System.out.println(this.getClass().getSimpleName()+"class Object create");
	}

	@Override
	public String toString() {
		return "BookTicket [gateway=" + gateway + "]";
	}
	

}
