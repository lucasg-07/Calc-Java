package br.edu.uteis;

public class Calculadora {

	public static void somar(int a, int b) {
		System.out.println("The result of the sum is " + (a + b));
		
	}
	public static void subtracao(int a, int b) {
		System.out.println("The result of the subtraction is " + (a - b));
		
	}
	public static void mult(int a, int b) {
		System.out.println("The result of the multiplication is " + (a * b));
		
	}
	public static void div(int a, int b) {
		System.out.println("The result of the division is " + (a / b));
		
	}
	public static void power(int a, int b) {
		System.out.println("The result of the power is " + (Math.pow(a, b)));
		
	}
}
