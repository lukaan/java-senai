package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

		double base, altura, perimetro, area, diagonal;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a base do retângulo: ");
		base = sc.nextDouble();
		
		System.out.println("Digite a altura do retângulo: ");
		altura = sc.nextDouble();
		
		sc.close();
		
		area = (base * altura);
		
		perimetro = (2 * (base + altura));
		
		diagonal = Math.sqrt(((base*base)+(altura*altura)));
		
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Area: " + area);
		System.out.println("Diagonal: " + diagonal);
		

	}

}
