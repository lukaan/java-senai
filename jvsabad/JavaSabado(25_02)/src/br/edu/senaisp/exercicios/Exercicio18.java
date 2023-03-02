package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		double num;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um numero: ");
		num = sc.nextDouble();
		
		sc.close();
		
		System.out.println("Numero: " + num);
		System.out.println("Quadrado: " + Math.pow(num, 2));	
		// pow(valor, expoente)
	}
	
}