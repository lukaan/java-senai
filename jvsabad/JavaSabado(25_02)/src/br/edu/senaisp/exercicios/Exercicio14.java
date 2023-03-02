package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		double num1, num2, num3, num4, media;
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Digite um numero 1: ");
		num1 = sc.nextDouble();
		
		System.out.println("Digite um numero 2: ");
		num2 = sc.nextDouble();
		
		System.out.println("Digite um numero 3: ");
		num3 = sc.nextDouble();
		
		System.out.println("Digite um numero 4: ");
		num4 = sc.nextDouble();
		
		sc.close();
		
		media = ((num1*1) + (num2*2) + (num3*3) + (num4*4)) / (1+2+3+4);
		
		System.out.println("Média ponderada: " + media);
	}
	
}
//Entrar com quatro números e imprimir a média ponderada, sabendo-se que os 
//pesos são respectivamente: 1, 2, 3 e 4.
