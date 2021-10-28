package Aula1308;

import java.util.Scanner;

public class Exercicio4 {
	public static double  valor4, valor5, valor6;
	public static void main(String[] args) {
		myMethod4();
	}

	private static void myMethod4() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("DIIGITE A PRIMEIRA NOTA");
		valor4 = entrada.nextDouble();
		System.out.println("DIIGITE A SEGUNDA NOTA");
		valor5 = entrada.nextDouble();
		valor6 = ((valor4 + valor5) / 2);
		System.out.println("A média aritmética é " + valor6);
		
		System.out.println(valor6);
		if ( valor6 >= 70) {
			System.out.println("Aluno aprovado");
		}
		else {
			System.out.println("Aluno reprovado");
		}
	}

		
	}
	

