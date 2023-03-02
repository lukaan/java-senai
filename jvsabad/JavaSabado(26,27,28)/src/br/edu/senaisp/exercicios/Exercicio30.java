package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		
		double catetoAdjacente, catetoOposto, hipotenusa;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor do cateto adjacente:");
		catetoAdjacente = sc.nextDouble();
		
		System.out.println("Insira o valor do cateto oposto:");
		catetoOposto = sc.nextDouble();
		
		sc.close();
		
		hipotenusa = Math.sqrt(Math.pow(catetoAdjacente, 2) + Math.pow(catetoOposto, 2));
		
		System.out.println("Hipotenusa: " + hipotenusa);
	}

}
