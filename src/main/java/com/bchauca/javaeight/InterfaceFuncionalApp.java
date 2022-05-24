package com.bchauca.javaeight;

public class InterfaceFuncionalApp {

	public double calcular(double x, double y) {
		Operacion operacion = (double n1, double n2) -> n1 + n2;
		
		return operacion.calcularOperacion(x, y);
	}
	
	public static void referenciaMetodoStatic() {
		System.out.println("Hola a todos desde static");
	}
	
	public void test() {
		//Greetings greetings = () -> InterfaceFuncionalApp.referenciaMetodoStatic();
		//greetings.Saludar();
		
		Greetings greetings = InterfaceFuncionalApp::referenciaMetodoStatic;
		greetings.Saludar();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceFuncionalApp interfaceFuncionalApp = new InterfaceFuncionalApp();				
		//System.out.println(interfaceFuncionalApp.calcular(2, 3));
		interfaceFuncionalApp.test();
	}

}
