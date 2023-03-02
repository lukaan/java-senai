package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Digite um número inteiro: ");
		numero = sc.nextInt();
		
		System.out.println("Sucessor: " + (numero+1));
		System.out.println("Antecessor: " + (numero-1));
		
		
		sc.close();
		
		
	}
	
}


//Leia um número e imprima seu sucessor e 	antecessor
