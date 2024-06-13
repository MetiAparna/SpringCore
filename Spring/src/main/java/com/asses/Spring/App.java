package com.asses.Spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.asses.Spring.config.AppConfiguration;
import com.asses.Spring.util.Bike;
import com.asses.Spring.util.BookTicket;
import com.asses.Spring.util.PaymentGateway;
import com.asses.Spring.util.Person;
import com.asses.Spring.util.car;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfiguration.class);
        ctx.refresh();
      /*  PaymentGateway gateway = ctx.getBean(PaymentGateway.class);//its give objects of class/getBean is provided in application Context
       
        BookTicket bean = ctx.getBean(BookTicket.class);
       System.out.println(bean);
           gateway.makePayment();
      System.out.println(gateway);
    */    
       Person p = ctx.getBean(Person.class);
       car c=ctx.getBean(car.class);
      Bike b=ctx.getBean(Bike.class);
       p.goingToWork();
    }
}
