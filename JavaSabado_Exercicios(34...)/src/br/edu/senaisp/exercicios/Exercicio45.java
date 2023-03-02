package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio45 {

	public static void main(String[] args) {
		
		double salarioMinimo, qtdSalario, salarioPessoa;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salario minimo: ");
		salarioMinimo = sc.nextDouble();
		
		System.out.println("Digite o seu salario: ");
		salarioPessoa = sc.nextDouble();
		
		sc.close();
		
		qtdSalario = salarioPessoa/salarioMinimo;
		
		System.out.println("Quantidade de salarios minimos: " + qtdSalario);
	}
	
	
}
