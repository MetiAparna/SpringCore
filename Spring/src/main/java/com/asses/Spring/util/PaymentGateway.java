package com.asses.Spring.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Scope("singleton")
@Component
public class PaymentGateway
{
	@Value("HDF12345")
	private String cardNumber;
	@Value("user@hdfc.com")
	private String userName;
	
	public PaymentGateway()
	{
		System.out.println(this.getClass().getSimpleName()+"class Object create");
		
	}
	public void makePayment()
	{
		System.out.println("payment made succesfully");
	}
	
	
	
	
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return "PaymentGateway [cardNumber=" + cardNumber + ", userName=" + userName + "]";
	}
}