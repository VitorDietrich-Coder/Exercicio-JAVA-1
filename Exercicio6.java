package Aula1308;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		myMethod6();
	}

	private static void myMethod6() {
		int valor1, valor2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("DIGITE O VALOR");
		valor1 = entrada.nextInt();
		System.out.println("DIGITE O SEGUNDO VALOR");
		valor2 = entrada.nextInt();
		
		if (valor1 == valor2) {
			System.out.println("VALORES SÃO IGUAIS");
		}
		else if (valor1 > valor2){
			String Converter1 = Integer.toString(valor1);
			String Converter2 = Integer.toString(valor2);
			System.out.println(Converter1 + ", " + Converter2);
		}
		else {
			String Converter1 = Integer.toString(valor1);
			String Converter2 = Integer.toString(valor2);
			System.out.println(Converter2 + ", " + Converter1);
		} 
	}
	
		
	}
	
