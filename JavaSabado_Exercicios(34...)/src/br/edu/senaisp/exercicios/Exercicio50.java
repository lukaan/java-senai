package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio50 {

	public static void main(String[] args) {
		
		double aplicacaoMensal, taxa, valorAcumulado, valorAtual;
		int numeroMeses;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor atual total na aplicacao: ");
		valorAtual = sc.nextDouble();
		
		System.out.println("Digite o valor da aplicacao mensal: ");
		aplicacaoMensal = sc.nextDouble();
		
		System.out.println("Digite a taxa mensal de rendimento: ");
		taxa = sc.nextDouble();
		
		System.out.println("Digite a quantidade de meses aplicada: ");
		numeroMeses = sc.nextInt();
		
		sc.close();
		
		taxa = taxa/100;
		
		valorAcumulado = valorAtual *  Math.pow(1+taxa, numeroMeses) + aplicacaoMensal * ((Math.pow(1+taxa, numeroMeses) -1)) / taxa ;
		
		System.out.println("Valor acumulado R$: " + valorAcumulado);
		
	}
}
