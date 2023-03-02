package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		int numero1, numero2, produto;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		numero1 = sc.nextInt();
		
		System.out.println("Digite outro numero inteiro: ");
		numero2 = sc.nextInt();
		
		sc.close();
		
		produto = numero1 * numero2;
		
		System.out.println("Produto: " + produto);
		
	}
	
	
}
//Ler dois números inteiros e imprimir o produto.