package br.edu.principal;
import java.util.Scanner;
import br.edu.uteis.*;

public class Principal {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Insert the first number : ");
		int a = sc.nextInt();
		System.out.printf("Insert the second number : ");
		int b = sc.nextInt();
		sc.close();
		Calculadora.somar(a,b);
		
		Calculadora.subtracao(a,b);
			
		Calculadora.mult(a,b);

		Calculadora.div(a,b);
		
		Calculadora.power(a,b);
		
		
	}
}
