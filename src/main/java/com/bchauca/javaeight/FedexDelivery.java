package com.bchauca.javaeight;

public class FedexDelivery extends DeliveryMethod {

	@Override
	public void sendEmail() {
		System.out.println("Email to Fedex");
		//super.sendEmail();
	}
}
