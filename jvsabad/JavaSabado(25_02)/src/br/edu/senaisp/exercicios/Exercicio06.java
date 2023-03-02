package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		int numero1, numero2;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um numero inteiro: ");
		numero1 = sc.nextInt();		
		
		System.out.println("Digite outro numero inteiro: ");
		numero2 = sc.nextInt();
		
		
		System.out.println("Numero 1: " + numero1);
		System.out.println("Numero 2: " + numero2);

		sc.close();
		
		
		
	}
	
}
