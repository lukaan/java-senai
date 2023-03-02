package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		int numero1, numero2, soma;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um numero inteiro: ");
		numero1 = sc.nextInt();
		
		System.out.println("Digite outro numero inteiro: ");
		numero2 = sc.nextInt();
		
		sc.close();
		
		soma = numero1 + numero2;
		
		System.out.println("Soma: " + soma);
		
	}
	
}
//Ler dois números inteiros e imprimir a soma. Antes do resultado, deverá aparecer a mensagem: Soma.