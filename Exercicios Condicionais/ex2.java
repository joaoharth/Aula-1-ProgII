package atividades;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) { 
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro");
		int n1 = leitor.nextInt();
		
		int calculo = n1 % 2;
		
		if (calculo == 0) {System.out.println("O número digitado é par");
		
		}else System.out.println("O número digitado é impar");
		
		
		leitor.close();
		
		// TODO Auto-generated method stub

	}

}
