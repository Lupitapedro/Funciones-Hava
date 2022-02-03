package Funciones;
import java.util.Scanner;

public class Calculadora {
	static double suma(double a, double b) {
		return a+b;
		
	}
	static double resta(double a, double b) {
		return a-b;
		
	}
	static double multiplicacion(double a, double b) {
		return a*b;
		
	}
	static double division(double a, double b) {
		return a/b;
		
	}
	
	static double exponente(double a, double b) {
		return Math.pow(a, b);
		
	}
	
	static double raiz(double a) {
		return Math.sqrt(a);
	
	}
	
	static double raiiz(double b) {
		return Math.sqrt(b);
	
	}
	
	static double cuadrado (double a) {
		return a*a;
		
	}
	
	static double cuadraado (double b) {
		return b*b;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		double x = s1.nextDouble();
		Scanner s2 = new Scanner(System.in);
		System.out.println("Introduce el segundo número: ");
		double y = s2.nextDouble();
		
		System.out.println("La suma es: "+suma(x,y));
		System.out.println("La resta es: "+resta(x,y));
		System.out.println("La multiplicacion es: "+multiplicacion(x,y));
		System.out.println("La division es: "+division(x,y));
		System.out.println("El número "+x+" elevado a la "+y+ " potencia es: "+exponente(x,y));
		System.out.println("La Raiz cuadrada del primer numero es: "+raiz(x));
		System.out.println("La Raiz cuadrada del segundo numero es: "+raiiz(y));
		System.out.println("La cuadrado del primer numero es: "+cuadrado(x));
		System.out.println("La cuadrado del segundo numero es: "+cuadraado(y));
	}

}
