package com.bchauca.javaeight;

public class CreditCardPayment extends PaymentMethod {
	
	@Override
	public void callOtherService() {
		System.out.println("Call Method CreditCard");
	}
}
