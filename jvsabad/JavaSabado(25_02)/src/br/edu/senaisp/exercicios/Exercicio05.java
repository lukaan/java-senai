package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número inteiro: ");
		numero = sc.nextInt();
		
		System.out.println("O número digitado é: " + numero);
		
		sc.close();
	}
}
