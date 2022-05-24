package com.bchauca.javaeight;

import java.util.List;

public class ShoppingCart {
	
	private List<Product> productItems;
	private PaymentMethod paymentMethod;
	private DeliveryMethod deliveryMethod;
	
	public List<Product> getProductItems() {
		return productItems;
	}
	
	public void setProductItems(List<Product> productItems) {
		this.productItems = productItems;
	}
	
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}
	
	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	public DeliveryMethod getDeliveryMethod() {
		return deliveryMethod;
	}
	
	public void setDeliveryMethod(DeliveryMethod deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}
	
	public void checkout() {
		//productItems
		//paymentMethod
		//deliveryMethod
		System.out.println("Saving to database");		
		this.deliveryMethod.sendEmail();
		this.paymentMethod.callOtherService();
	}
}
