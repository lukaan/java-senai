package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio43 {

	public static void main(String[] args) {
		
		double valorDeposito, taxaRendimento, valorRendimento, valorTotal;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor do deposito: ");
		valorDeposito = sc.nextDouble();
		
		System.out.println("Digite a taxa de rendimento: ");
		taxaRendimento = sc.nextDouble();
		
		sc.close();
		
		valorRendimento = valorDeposito * (taxaRendimento/100);
		valorTotal = valorDeposito + valorRendimento;
		
		System.out.println("Valor Deposito: R$ " + valorDeposito);
		System.out.println("Valor Rendimento: R$ "+ valorRendimento);
		System.out.println("Valor Total: R$ " + valorTotal);
		
	}
}
