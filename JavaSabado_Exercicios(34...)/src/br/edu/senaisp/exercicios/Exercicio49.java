package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio49 {

	public static void main(String[] args) {
		// irei supor que a formula não é fatorial e sim uma divisão
		int lados, diagonais;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a quantidade de lados do poligono: ");
		lados = sc.nextInt();
		
		sc.close();
		
		diagonais = lados * (lados-3) / 2;
		
		System.out.println("Quantidade de diagonais: " + diagonais);

	}

}
