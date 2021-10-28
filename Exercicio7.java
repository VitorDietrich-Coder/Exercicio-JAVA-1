package Aula1308;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		myMethod7();
	}

	private static void myMethod7() {
		Scanner entrada = new Scanner(System.in);
			int inicio, fim, duracao;
			System.out.println("Inserir horário de inicio ");
			inicio = entrada.nextInt();
			System.out.println("Inserir horário do fim ");
			fim = entrada.nextInt();
			
			duracao  =  fim - inicio; 
				
			if (inicio == fim){
				System.out.println("o tempo excedeu o limite");
				
			}
			else if (fim < inicio){
				
				System.out.println("dado incorreto");
				
			}
			else {
				System.out.println("duração do jogo é " +  duracao + "h");
				
			}
				
		}

		
	}
	

