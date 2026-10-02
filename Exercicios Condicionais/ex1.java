package atividades;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o 1 numero inteiro");
		int valor1 = Integer.parseInt(leitor.nextLine());
		
		System.out.println("Digite o 2 numero inteiro");
		int valor2 = Integer.parseInt(leitor.nextLine());
		
		int soma = valor1 + valor2;
		int mult = valor1 * valor2;
		int div = valor1 / valor2;
		int resto = valor1 % valor2;
		
		System.out.println("soma = " + soma);
		System.out.println("mult ="+ mult);
		System.out.println("div ="+ div);
		System.out.println("resto ="+ resto);
		
		leitor.close();
		
		
				
	

	}

}
