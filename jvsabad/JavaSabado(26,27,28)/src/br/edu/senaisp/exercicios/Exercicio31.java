package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		
		int razao, valor1, valorFinal, posicao;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a razao da PA: ");
		razao = sc.nextInt();
		
		System.out.println("Digite o primeiro valor da PA: ");
		valor1 = sc.nextInt();
		
		System.out.println("Digite qual posicao voce quer descobrir: ");
		posicao = sc.nextInt();
		
		sc.close();
		
		valorFinal = (valor1 + (posicao - 1) * razao);
		
		System.out.println("Valor: " + valorFinal);	
	}
	
}
