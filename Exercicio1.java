package Aula1308;

import java.util.Scanner;

public class Exercicio1 {
	
	public static int valor1, valor2, valor3;
	public static String resultado1, resultado2;
	public static double valormaca1, valormaca2, valor4, valor5, valor6, valormaca3;
	public static void main(String[] args) {
		pedirinforma��es();
		compararinforma��es();
		
	}

	private static void compararinforma��es() {
		if(valor1 > 10) {
		System.out.println("valor maior que 10");
		
		}
		if (valor1 == 10) {
			System.out.println("valor igual a 10");
			
		}
		if (valor1 < 10) {
			System.out.println("valor menor que 10");
		}
		}
	private static void pedirinforma��es() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("DIGITE UM VALOR");
		valor1 = entrada.nextInt();
	}
}





