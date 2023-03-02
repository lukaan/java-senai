package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		double numero1, numero2, media;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um numero real: ");
		numero1 = sc.nextDouble();
		
		System.out.println("Digite outro numero real: ");
		numero2 = sc.nextDouble();
		
		sc.close();
		
		media = (numero1 + numero2)/2;
		
		System.out.println("Média: " + media);
		
	}
}
// Entrar com dois números reais e imprimir a média aritmética com a mensagem média antes do resultado.