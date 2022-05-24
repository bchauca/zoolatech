package com.bchauca.javaeight;

public class UPSDelivery extends DeliveryMethod {

	@Override
	public void sendEmail() {
		System.out.println("Email to UPS");
		//super.sendEmail();
	}
}
