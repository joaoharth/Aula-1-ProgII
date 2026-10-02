package atividades;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário:");
		double salario = leitor.nextDouble();
		System.out.println("Porcentagem de aumento:");
		double porcentagem = leitor.nextDouble();
		
		
		double calculo = porcentagem / 100 * salario;
		
		double aumento = calculo + salario;
		
		double diferença = aumento - salario;
		
		System.out.println("Salario:"+ salario);
		
		System.out.println("Percentual Aumento:"+ porcentagem + "%");
		
		System.out.println("O aumento foi de: R$" + diferença);
		
		System.out.println("Novo salário:" + aumento);
		
				
				
		leitor.close();
		
		
		// TODO Auto-generated method stub

	}

}
