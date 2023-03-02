package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main(String[] args) {

		double numero1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero real: ");
		numero1 = sc.nextDouble();
		
		sc.close();
		
		System.out.println("1/3 do valor: " + (numero1/3));
		
		
	}
}
// Ler um número real e imprimir a terça parte deste número.
