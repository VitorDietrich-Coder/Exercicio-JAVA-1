package Aula1308;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		myMethod5();
	}

	private static void myMethod5() {
			int valor1, valor2;
			Scanner entrada = new Scanner(System.in);
			System.out.println("DIGITE O PRIMEIRO VALOR");
			valor1 = entrada.nextInt();
			System.out.println("DIGITE O SEGUNDO VALOR");
			valor2 = entrada.nextInt();
			
			if (valor1 == valor2) {
				System.out.println("Valores são iguais");
			}
			else if (valor1 > valor2){
				System.out.println(valor1 + " é maior");
			}
			else {
				System.out.println(valor2 + " é maior");
			} 
		}

		
	}
	

