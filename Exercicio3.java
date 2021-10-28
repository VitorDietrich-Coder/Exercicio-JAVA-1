package Aula1308;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
	public static int valor3;
	public static double valormaca1, valormaca2, valormaca3;
	public static void main(String[] args) {
		myMethod3();
	}

	private static void myMethod3() {
		valormaca1 = 1.30;
		valormaca2 = 1.00;
		Scanner entrada = new Scanner(System.in);
		System.out.println("DIGITE UM VALOR MEU CONSAGRADO");
		valor3 = entrada.nextInt();
		if (valor3 >= 12) {
			valormaca3 = (valormaca2 * valor3);
		}
		else{
			valormaca3 = (valormaca1 * valor3);
		}
		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
	    System.out.println(formatter.format(valormaca3));
		
	}
	

}
