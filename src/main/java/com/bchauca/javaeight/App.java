package com.bchauca.javaeight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App implements DefaultMethods
{	
	public void ordenar() {
		List<String> lista = new ArrayList<>();
		lista.add("Chauca");
		lista.add("Bryan");
		lista.add("Fernando");
		lista.add("Hinostroza");
		
		/*JDK 1.7
		Collections.sort(lista, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {				
				return o1.compareTo(o2);
			}
		});*/
		
		Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));
		
		for(String item : lista) {
	        System.out.println(item);
        }
	}
	
	public void calcular() {
		/* JDK 1.7 
		Operacion operacion = new Operacion() {			
			@Override
			public double calcularOperacion(double n1, double n2) { 
				return (n1 + n2) / 2;
			}
		};*/
		
		Operacion operacion = (double n1, double n2) -> (n1 + n2) / 2;
		
		System.out.println(operacion.calcularOperacion(5, 11));
	}
	
	public void calcularSintaxis2() {		
		Operacion operacion = (double n1, double n2) -> {
			System.out.println("n1: " + n1);
			System.out.println("n2: " + n2);
			return (n1 + n2) / 2; 
		};
		
		System.out.println(operacion.calcularOperacion(5, 11));
	}
	
	public void calcularSintaxis3() {
		Operacion operacion = (n1, n2) -> (n1 + n2) / 2;
		
		System.out.println(operacion.calcularOperacion(5, 11));
	}
	
	public double probarVariableLocal() {
		final double n3 = 3;//obligatorio usar final
		
		Operacion op = (n1, n2) -> {
			return n1 + n2 + n3;
		};
		
		return op.calcularOperacion(1, 2);
	}
	
	private static double attr1;
	private double attr2;
	
	public double probarAtributosStatic() {				
		Operacion op = (n1, n2) -> {
			attr1 = n1 + n2;
			attr2 = attr1;
			return attr2;
		};
		
		return op.calcularOperacion(3, 2);
	}
	
    public static void main( String[] args )
    {        
        App app = new App();
        //app.ordenar(); 
        //app.calcular();
        //app.calcularSintaxis2();
        //app.calcularSintaxis3();
        
        //System.out.println(app.probarVariableLocal());
        //System.out.println(app.probarAtributosStatic());
        
        app.saludar();
    }

	@Override
	public void caminar() {
		// TODO Auto-generated method stub
		
	}
}
