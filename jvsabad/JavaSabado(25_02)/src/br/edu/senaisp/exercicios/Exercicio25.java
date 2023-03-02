package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		
		double a, b, c, diagonal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o lado A: ");
		a = sc.nextDouble();
		
		System.out.println("Digite o lado B: ");
		b = sc.nextDouble();
		
		System.out.println("Digite o lado C: ");
		c = sc.nextDouble();

		sc.close();
		
		diagonal = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
		
		System.out.println("Diagonal: " + diagonal);
		
	}

}
