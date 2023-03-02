package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		
		double valorProduto, valorDesconto, valorDescontado;
		final double DESCONTO = 0.09;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor do produto");
		valorProduto = sc.nextDouble();
		
		sc.close();
		
		valorDesconto = valorProduto * DESCONTO;
		valorDescontado = valorProduto - valorDesconto;
		System.out.println("Valor do produto: R$ " + valorProduto);
		System.out.println("Valor do desconto: R$ " + valorDesconto);
		System.out.println("Valor descontado: R$ " + valorDescontado);
		
		
	}

}
