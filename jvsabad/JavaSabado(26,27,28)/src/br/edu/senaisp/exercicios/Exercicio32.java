package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		
		int valor1, razao;
		double valorFinal;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a razão da PG: ");
		razao = sc.nextInt();
		
		System.out.println("Digite o primeiro termo da PG: ");
		valor1 = sc.nextInt();

		
		sc.close();
		valorFinal = (valor1 * (Math.pow(razao, 4)));
		
		System.out.println("Valor: " + valorFinal);

	}

}
