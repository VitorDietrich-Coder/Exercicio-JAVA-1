package Aula1308;

import java.util.Scanner;

public class Exercicio2 {
	public static int  valor2;
	public static void main(String[] args) {
	myMethod2();
	}
	private static void myMethod2() {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite um valor meu amigo");
			valor2 = entrada.nextInt();
			if (valor2 >= 0) {
				System.out.println("valor positivo");
			}
			else{
				System.out.println("valor negativo");
			}
			
		}
		
	}

