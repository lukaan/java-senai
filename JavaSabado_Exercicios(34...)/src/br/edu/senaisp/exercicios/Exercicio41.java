package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio41 {

	public static void main(String[] args) {
		
		double valorComanda, valorFinal;
		final double TAXA_SERVICO = 0.10;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor da comanda: ");
		valorComanda = sc.nextDouble();
		
		sc.close();
		
		valorFinal = valorComanda + (valorComanda * TAXA_SERVICO);
		
		System.out.println("Valor da comanda: R$ " + valorComanda);
		System.out.println("Valor da comanda + Taxa de servico: R$ "+ valorFinal);

	}

}
