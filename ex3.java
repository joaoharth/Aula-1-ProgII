package atividades;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("DIgite um numero");
		
		float n1 = leitor.nextInt();
		
		System.out.println("Digite outro número");
		
		float n2 = leitor.nextInt();
		
		
		float calculo = n1 / n2; 
				
		if (calculo == 1) {
		System.out.println("Os números são iguais");
		
		} else  {
			System.out.println("Os números são diferentes");
		 if (n1 > n2) { 
			System.out.println("O maior número é:" + n1);
		 	
		} else {
			System.out.println("O maior número é:"+ n2);
		}	
		}
		// TODO Auto-generated method stub

	}

}
