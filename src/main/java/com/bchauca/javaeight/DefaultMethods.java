package com.bchauca.javaeight;

public interface DefaultMethods {	
	public void caminar();
	
	default public void saludar() {
		System.out.println("Hola a todos");
	}
}
