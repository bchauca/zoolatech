package com.bchauca.javaeight;

//las interfaces funcionales solo pueden tener un metodo
@FunctionalInterface
public interface Operacion {
	double calcularOperacion(double n1, double n2);
	//int test(double n1, double n2);
}
